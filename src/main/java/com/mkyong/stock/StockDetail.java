package com.mkyong.stock;

public class StockDetail implements java.io.Serializable{
	private Integer stockId;
	private Stock stock;
	private String compName;
	private String compDesc;
	private String remark;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
