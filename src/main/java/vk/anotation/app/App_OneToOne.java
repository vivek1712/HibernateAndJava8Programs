package vk.anotation.app;

import org.hibernate.Session;

import vk.anotation.stock.StockA;
import vk.anotation.stock.StockDetailA;

import com.mkyong.util.HibernateUtil;

public class App_OneToOne {
public static void main(String arg[]){
	System.out.println("Hibernate one to one (Annotation)");
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	session.beginTransaction();

	insertOneToOne(session);
	
	session.getTransaction().commit();

	System.out.println("Done");
	
}

public static void insertOneToOne(Session session){
	StockA stock = new StockA();

	stock.setStockCode("7052");
	stock.setStockName("annotation one to one");
	
	StockDetailA stockDetail = new StockDetailA();
	stockDetail.setCompName("one to one annotation");
	stockDetail.setCompDesc("one stop shopping");
	stockDetail.setRemark("vinci vinci");
	
	stock.setStockDetail(stockDetail);
	stockDetail.setStock(stock);
	
	session.save(stock);
	
}
}
