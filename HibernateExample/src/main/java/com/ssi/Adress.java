package com.ssi;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	
	@Override
	public String toString() {
		return "Adress [hno=" + hno + ", district=" + district + ", state=" + state + "]";
	}
	private int hno;
	private String district;
	private String state;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Adress(int hno, String district, String state) {
		super();
		this.hno = hno;
		this.district = district;
		this.state = state;
	}
	public Adress() {
		super();
	}
	
	
	
	
	
	
}
