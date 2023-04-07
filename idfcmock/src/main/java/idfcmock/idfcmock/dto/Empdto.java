package idfcmock.idfcmock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empdto {
	@Id
	private int emp_id;
	private String name;
	private String sal;
	private long phno;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Empdto [emp_id=" + emp_id + ", name=" + name + ", sal=" + sal + ", phno=" + phno + "]";
	}
	
	
}
