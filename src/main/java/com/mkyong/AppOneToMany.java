package com.mkyong;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mkyong.util.HibernateUtil;
import com.mkyong.stock.*;

public class AppOneToMany {
public static void main(String arg[]){
	System.out.println("Hibernate one to many (XML Mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
   insertStockWithManyDailyRecord(session);
	//selectOperation(session);
	//getAndUpdate(session);
	session.getTransaction().commit();
	System.out.println("Done");
}

public static void getAndUpdate(Session session){
	
	Stock st=(Stock) session.get(Stock.class, 5);
	System.out.println("Stock table");
	System.out.println("id  "+st.getStockId()+" code :"+st.getStockCode() +" Name "+st.getStockName());
	System.out.println("Stock detail table");
	if(st.getStockDetail()!=null){
	System.out.println("id  "+st.getStockDetail().getStockId()+" desc :"+st.getStockDetail().getCompDesc() +" Name "+st.getStockDetail().getCompName());
	}
	st.setStockCode("26");
	st.setStockName("RajMany");
	if(st.getStockDetail()!=null){
	st.getStockDetail().setCompDesc("raj Many Desc");
	}
	if(st.getStockDailyRecords()!=null){
		for(StockDailyRecord stDaily : st.getStockDailyRecords()){
			stDaily.setPriceClose(8F);
			stDaily.setPriceOpen(10F);
			}
	}
	session.update(st);
}

public  static void insertStockWithManyDailyRecord(Session session){
	Stock stock = new Stock();
	stock.setStockCode("111");
	stock.setStockName("VkMany");
	
	//session.save(stock);
	StockDailyRecord stockDailyRecords1 = new StockDailyRecord();
	
	stockDailyRecords1.setPriceClose(1F);
	stockDailyRecords1.setPriceOpen(2F);
	stockDailyRecords1.setStock(stock);
	
StockDailyRecord stockDailyRecords2 = new StockDailyRecord();
	
	stockDailyRecords2.setPriceClose(3F);
	stockDailyRecords2.setPriceOpen(4F);
	stockDailyRecords2.setStock(stock);
	Set<StockDailyRecord> listStck=new HashSet<StockDailyRecord>();
	listStck.add(stockDailyRecords1);
	listStck.add(stockDailyRecords2);
	stock.setStockDailyRecords(listStck);
	
	//session.save(stockDailyRecords1);
	//session.save(stockDailyRecords2);
	session.save(stock);
	
}

public  static void selectOperation(Session session){
	String hql="FROM Stock S";
	Query qry=session.createQuery(hql);
	List<Stock> stc= qry.list();
	for(Stock st:stc){
		System.out.println("Stock table");
		System.out.println("id  "+st.getStockId()+" code :"+st.getStockCode() +" Name "+st.getStockName());
		System.out.println("Stock detail table");
		if(st.getStockDetail()!=null){
		System.out.println("id  "+st.getStockDetail().getStockId()+" desc :"+st.getStockDetail().getCompDesc() +" Name "+st.getStockDetail().getCompName());
		}
		System.out.println("Stock daily record detail table");
		if(st.getStockDailyRecords()!=null){
		for(StockDailyRecord stDaily : st.getStockDailyRecords()){
		System.out.println("id  "+stDaily.getRecordId()+" price close :"+stDaily.getPriceClose() +" price open "+stDaily.getPriceOpen());
		}
		}
		}
}

}
