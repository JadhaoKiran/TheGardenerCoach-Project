package com.app.pojos;

import javax.persistence.*;



@Entity

public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	private int qty;
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	public OrderDetails() {
		super();
	}
	public OrderDetails(int id, Product product, int qty, Order order) {
		super();
		this.id = id;
		this.product = product;
		this.qty = qty;
		this.order = order;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", qty=" + qty + ", order=" + order + "]";
	}
	
	

}
