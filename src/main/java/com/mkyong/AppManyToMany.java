package com.mkyong;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.mkyong.stock.Category;
import com.mkyong.stock.Stock;
import com.mkyong.util.HibernateUtil;

public class AppManyToMany {
public static void main(String arg[]){
	System.out.println("Hibernate many to many (XML Mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	insertManytoMany(session);
	
	session.getTransaction().commit();
	System.out.println("Done");
}

public static void insertManytoMany(Session session){
	Stock stock = new Stock();
    stock.setStockCode("222");
    stock.setStockName("Many to Many");
    
        
    Category category1=new Category();
    category1.setDesc("Category1 Desc");
    category1.setName("Category1 Name");
    
    Category category2=new Category();
    category2.setDesc("Category2 Desc");
    category2.setName("Category2 Name");
    
    Set<Category> categories = new HashSet<Category>();
    categories.add(category1);
    categories.add(category2);
    for(Category cat:categories){
    	System.out.println("cat name"+cat.getName()+"  desc "+cat.getDesc());
    }
    stock.setCategories(categories);
    
    session.save(stock);
}
}
