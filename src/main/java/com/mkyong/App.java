package com.mkyong;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mkyong.stock.Stock;
import com.mkyong.stock.StockDetail;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (XML mapping)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		//insertOperation(session);
		//selectOperation(session);
		saveOrupdateCheck(session);
		//getAndUpdate(session);
		//getAndDelete(session);
		//deleteOperationHql(session); // cant do because child parent relationship
		//selectNamedSelectQuery(session);
		//updateNamedParamenter(session);
		//session.getTransaction().commit();
		//selectNamedSelectQuery(session);
		session.getTransaction().commit();

		System.out.println("Done");
	}
	
	public static void getAndDelete(Session session){
		Stock st=(Stock) session.get(Stock.class, 1);
		
		session.delete(st);
		
	}
	
	public static void getAndUpdate(Session session){
		
		Stock st=(Stock) session.get(Stock.class, 1);
		System.out.println("Stock table");
		System.out.println("id  "+st.getStockId()+" code :"+st.getStockCode() +" Name "+st.getStockName());
		System.out.println("Stock detail table");
		System.out.println("id  "+st.getStockDetail().getStockId()+" desc :"+st.getStockDetail().getCompDesc() +" Name "+st.getStockDetail().getCompName());
		st.setStockCode("26");
		st.setStockName("vivek");
		st.getStockDetail().setCompDesc("vivek Desc");
		session.update(st);
		
	}
	
	public  static void deleteOperationHql(Session session){
		String hql="DELETE FROM Stock  where stockId=:stockId";
		Query qry=session.createQuery(hql);
		qry.setParameter("stockId", 1);
		
		int result=qry.executeUpdate();
		System.out.println("Rows Affected : "+result);
	}
	
	public  static void updateNamedParamenter(Session session){
		String hql="UPDATE Stock set stockCode=:stockCode where stockId=:stockId";
		Query qry=session.createQuery(hql);
		qry.setParameter("stockId", 1);
		qry.setParameter("stockCode", "25");
		int result=qry.executeUpdate();
		System.out.println("Rows Affected : "+result);
	}
	
	public  static void selectNamedSelectQuery(Session session){
		String hql="FROM Stock S where S.stockId=:stockId";
		Query qry=session.createQuery(hql);
		qry.setParameter("stockId", 1);
		List<Stock> stc= qry.list();
		for(Stock st:stc){
			System.out.println("Stock table");
			System.out.println("id  "+st.getStockId()+" code :"+st.getStockCode() +" Name "+st.getStockName());
			System.out.println("Stock detail table");
			System.out.println("id  "+st.getStockDetail().getStockId()+" desc :"+st.getStockDetail().getCompDesc() +" Name "+st.getStockDetail().getCompName());
		}
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
		}
	}
	
	public  static void insertOperation(Session session){
		Stock stock = new Stock();

		stock.setStockCode("321");
		stock.setStockName("Chc");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("GENTING Malaysia");
		stockDetail.setCompDesc("Best resort in the world");
		stockDetail.setRemark("Nothing Special");
		

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);

	}
	
public static void saveOrupdateCheck(Session session){
		
	Stock stock = new Stock();

	stock.setStockCode("5554");
	stock.setStockName("merge with id");
	//stock.setStockId(25);
	//session.saveOrUpdate(stock);
	//session.persist(stock);
	//stock=(Stock) session.save(stock);
	
	session.merge(stock);
		
	}
}