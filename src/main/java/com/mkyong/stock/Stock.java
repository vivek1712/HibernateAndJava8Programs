package com.mkyong.stock;

import java.util.HashSet;
import java.util.Set;

public class Stock implements java.io.Serializable{
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private StockDetail stockDetail;
	
	private Set<Category> categories = new HashSet<Category>(0);
	
	private Set<StockDailyRecord> stockDailyRecords = 
			new HashSet<StockDailyRecord>(0);
	
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public StockDetail getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}
	public Set<StockDailyRecord> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
}
