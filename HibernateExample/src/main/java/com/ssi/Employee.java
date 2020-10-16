package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eno;
	private String ename;
	private Adress adress;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Employee(int eno, String ename, Adress adress) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.adress = adress;
	}
	public Employee() {
		super();
	}
	
	
	
}
