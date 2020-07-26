package vk.anotation.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock_daily_record" ,catalog="vivek")
public class StockDailyRecordA implements java.io.Serializable {

	private Integer recordId;
	private StockA stock;
	private Float priceOpen;
	private Float priceClose;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RECORD_ID",unique = true, nullable = false)
	public Integer getRecordId() {
		return recordId;
	}
	
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	
	@Column(name = "PRICE_OPEN", precision = 6)
	public Float getPriceOpen() {
		return priceOpen;
	}
	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}
	
	@Column(name = "PRICE_CLOSE", precision = 6)
	public Float getPriceClose() {
		return priceClose;
	}
	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="STOCK_ID")
	public StockA getStock() {
		return stock;
	}
	public void setStock(StockA stock) {
		this.stock = stock;
	}
	

	//getter, setter and constructor
}
