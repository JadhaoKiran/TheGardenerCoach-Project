package com.app.pojos;

import javax.persistence.*;



@Entity
@Table
public class Admin {

	
	@Id
	private String Id;
	private String email;
	private String pwd;
	private String uname;
	
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "Admin [userid=" + email + ", pwd=" + pwd + ", uname=" + uname + "]";
	}
	
	
	
}
