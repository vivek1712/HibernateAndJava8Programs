package vk.anotation.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="stock_detail", catalog="vivek")
public class StockDetailA implements java.io.Serializable{
	private Integer stockId;
	private StockA stock;
	private String compName;
	private String compDesc;
	private String remark;
	
	@GenericGenerator(name="generator",strategy="foreign",parameters=@Parameter(name="property", value="stock"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="STOCK_ID",unique=true,nullable=false)
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	@OneToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public StockA getStock() {
		return stock;
	}
	public void setStock(StockA stock) {
		this.stock = stock;
	}
	
	@Column(name="COMP_NAME")
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	@Column(name = "COMP_DESC")
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
