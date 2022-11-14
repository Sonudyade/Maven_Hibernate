package com.sony.JDBCMaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="details")

public class Details {
	
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
