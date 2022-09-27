package com.app.pojos;

import java.util.List;

import javax.persistence.*;





@Entity
@Table(name="sellers")
public class Seller 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 30)
	private String name;
	@Column(length = 30)
	private String city;
	@Column(unique=true, length = 30)
	private String email;
	@Column(length = 255)
	private String pwd;
	@Column(length = 30)
	private String phone;
	
	public Seller()
	{
		super();
	}
	public Seller(int id, String name, String city, String email, String pwd, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", pwd=" + pwd
				+ ", phone=" + phone + "]";
	}
	
	
	
}
