package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student {

	@Id
	private String email;
	private String password;
	private String name;
	private int contact;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Student(String email, String password, String name, int contact) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", password=" + password + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
	
	
}
