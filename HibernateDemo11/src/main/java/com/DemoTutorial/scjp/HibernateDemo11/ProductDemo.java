package com.DemoTutorial.scjp.HibernateDemo11;

import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ProductStock")
public class ProductDemo {
	@Id
	@Column(name="product_ID")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name="productPrice")
	private int productPrice;
	@Column(name="Remarks")
	private String remarks;
	@Override
	public String toString() {
		return "ProductDemo [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + ", remarks="
				+ remarks + "]";
	}
	public ProductDemo(int productId, String productName, int productPrice,
			String remarks) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.remarks = remarks;
	}
	public ProductDemo() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}