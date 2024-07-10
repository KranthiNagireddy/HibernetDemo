package com.hdemo2.model;

import javax.persistence.*;

@Entity
@Table(name="Emp")					//  Make it as Table
public class Emp 
{
	@Id								// Make it as primary key
	@Column(name="Eid")				// Make it as Column
	private int Eid;
	
	@Column(name="Ename", nullable=false)
	private String Ename;
	
	@Column(name="ESalary")
	private float ESalary;
	
	public Emp() {
	 
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public float getESalary() {
		return ESalary;
	}

	public void setESalary(float eSalary) {
		ESalary = eSalary;
	}
	
	
}