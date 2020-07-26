package vk.anotation.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import vk.anotation.stock.StockA;
import vk.anotation.stock.StockDailyRecordA;
import com.mkyong.util.HibernateUtil;

public class App_OneToMany {
public static void main(String arg[]){
	System.out.println("Hibernate one to many (Annotation)");
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();
	insertStockWithManyDailyRecord(session);
	
	session.getTransaction().commit();
	System.out.println("Done");
}

public  static void insertStockWithManyDailyRecord(Session session){
	StockA stock = new StockA();
	stock.setStockCode("111");
	stock.setStockName("one to ma ano");
	
	//session.save(stock);
	StockDailyRecordA stockDailyRecords1 = new StockDailyRecordA();
	
	stockDailyRecords1.setPriceClose(1F);
	stockDailyRecords1.setPriceOpen(2F);
	stockDailyRecords1.setStock(stock);
	
StockDailyRecordA stockDailyRecords2 = new StockDailyRecordA();
	
	stockDailyRecords2.setPriceClose(3F);
	stockDailyRecords2.setPriceOpen(4F);
	stockDailyRecords2.setStock(stock);
	Set<StockDailyRecordA> listStck=new HashSet<StockDailyRecordA>();
	listStck.add(stockDailyRecords1);
	listStck.add(stockDailyRecords2);
	stock.setStockDailyRecords(listStck);
	
	//session.save(stockDailyRecords1);
	//session.save(stockDailyRecords2);
	session.save(stock);
	
}

}
