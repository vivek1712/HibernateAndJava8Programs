package vk.anotation.stock;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;



@Entity
@Table(name="stock",catalog="vivek")
public class StockA implements java.io.Serializable{
	
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private StockDetailA stockDetail;
	
	private Set<StockDailyRecordA> stockDailyRecords = new HashSet<StockDailyRecordA>(
			0);
	
	private Set<CategoryA> categories = new HashSet<CategoryA>(0);
	
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name="STOCK_ID" , unique=true ,nullable=false)
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	
	@Column(name="STOCK_CODE")
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	@Column(name="STOCK_NAME")
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@OneToOne(fetch=FetchType.LAZY,mappedBy="stock",cascade = CascadeType.ALL)
	public StockDetailA getStockDetail() {
		return stockDetail;
	}
	public void setStockDetail(StockDetailA stockDetail) {
		this.stockDetail = stockDetail;
	}
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="stock",cascade = CascadeType.ALL)
	public Set<StockDailyRecordA> getStockDailyRecords() {
		return stockDailyRecords;
	}
	public void setStockDailyRecords(Set<StockDailyRecordA> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="stock_category",catalog="vivek",joinColumns={
			@JoinColumn(name="STOCK_ID",nullable = false, updatable = false)
	},
	inverseJoinColumns={@JoinColumn(name="CATEGORY_ID",nullable = false, updatable = false)}
	)
	public Set<CategoryA> getCategories() {
		return categories;
	}
	public void setCategories(Set<CategoryA> categories) {
		this.categories = categories;
	}
	
	
}
