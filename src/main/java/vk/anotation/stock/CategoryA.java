package vk.anotation.stock;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="category",catalog="vivek")
public class CategoryA {
	private Integer categoryId;
	private String name;
	private String desc;
	private Set<StockA> stocks = new HashSet<StockA>(0);
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CATEGORY_ID",unique = true, nullable = false)
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	@Column(name = "NAME", nullable = false, length = 10)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "[DESC]", nullable = false)
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@ManyToMany(fetch=FetchType.LAZY,mappedBy = "categories")
	public Set<StockA> getStocks() {
		return stocks;
	}
	public void setStocks(Set<StockA> stocks) {
		this.stocks = stocks;
	}

}
