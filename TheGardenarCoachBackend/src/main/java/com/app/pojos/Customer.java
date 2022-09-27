package com.app.pojos;

import javax.persistence.*;


@Entity
public class Customer {
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
	@Column(length = 30)
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Customer() {
		super();
	}
	public Customer(int id, String name, String city, String email, String pwd, String phone, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	

}
