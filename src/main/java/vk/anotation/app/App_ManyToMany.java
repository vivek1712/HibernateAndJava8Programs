package vk.anotation.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;




import vk.anotation.stock.CategoryA;
import vk.anotation.stock.StockA;

import com.mkyong.util.HibernateUtil;

public class App_ManyToMany {
public static void main(String arg[]){
	System.out.println("Hixbernate many to many (Annotation)");
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	insertManytoMany(session);
	//getAndUpdate(session);
	//getAndDelete(session);
	session.getTransaction().commit();
	System.out.println("Done");
}
public static void getAndDelete(Session session){
	StockA stock=(StockA) session.get(StockA.class, 39);
	session.delete(stock);
}

public static void getAndUpdate(Session session){
	StockA stock=(StockA) session.get(StockA.class, 36);
	System.out.println("Stock Details : " + stock.getStockName() +" , "+stock.getStockCode());
System.out.println("stock Category Details :");
for(CategoryA ca:stock.getCategories()){
	System.out.println("Stock CA : "+ca.getDesc() +" , "+ca.getName()+" , "+ca.getCategoryId());
}

System.out.println("Change values :");
stock.setStockCode("123A");
stock.setStockName("many to many ano");

for(CategoryA ca:stock.getCategories()){
	if(ca.getCategoryId()==8){
	ca.setDesc("Ca1 Ano desc");
	ca.setName("Ca1 name Ano");
	}else{
		ca.setDesc("CA2 Ano desc");
		ca.setName("Ca2 name ano");
	}
}
CategoryA newobj=new CategoryA();
newobj.setDesc("New Cate ano");
newobj.setName("new Cate Name");
stock.getCategories().add(newobj);
session.update(stock);
}

public static void insertManytoMany(Session session){
	StockA stock = new StockA();
    stock.setStockCode("222");
    stock.setStockName("Many to Many");
    
    //session.save(stock);  // beccause cascade disable so do manually 
    CategoryA category1=new CategoryA();
    //category1.setCategoryId(5);
    category1.setDesc("Category1 Desc");
    category1.setName("Category1 Name");
    
    CategoryA category2=new CategoryA();
    //category1.setCategoryId(6);
    category2.setDesc("Category2 Desc");
    category2.setName("Category2 Name");
    
    Set<CategoryA> categories = new HashSet<CategoryA>();
    categories.add(category1);
    categories.add(category2);
    //categories.add((CategoryA) session.get(CategoryA.class, 8));
    //categories.add((CategoryA) session.get(CategoryA.class, 9));
    for(CategoryA cat:categories){
    	System.out.println("cat name"+cat.getName()+"  desc "+cat.getDesc());
    }
    stock.setCategories(categories);
    
    session.save(stock);
}
}


