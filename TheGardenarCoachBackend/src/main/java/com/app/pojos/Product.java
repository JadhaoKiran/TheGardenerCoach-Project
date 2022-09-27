package com.app.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="products")
public class Product {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodid;
	@Column(length = 30)
	private String pname;
	@Column(length = 30)
	private String pcat;
	
	private int price;
	@Column(length = 100)
	private String photo;
	
	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name="sellerId")
	private Seller seller;

	public Product() {
		super();
	}

	public Product(int prodid, String pname, String pcat, int price, String photo, Seller seller) {
		super();
		this.prodid = prodid;
		this.pname = pname;
		this.pcat = pcat;
		this.price = price;
		this.photo = photo;
		this.seller = seller;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcat() {
		return pcat;
	}

	public void setPcat(String pcat) {
		this.pcat = pcat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", pname=" + pname + ", pcat=" + pcat + ", price=" + price + ", photo="
				+ photo + ", seller=" + seller + "]";
	}
	
	
}
