package org.bank.test.model.vo;
import java.sql.Date;
public class CustomerTable {
	private int id;
	private String name;
	private String idnum;
	private String password;
	private long phone;
	private String eamil;
	private float balance;
	private CustomerTable customer;
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
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public CustomerTable getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}
}
