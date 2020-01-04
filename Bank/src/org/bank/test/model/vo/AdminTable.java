package org.bank.test.model.vo;
import java.sql.Date;
public class AdminTable{
	private int id;
	private String name;
	private AdminTable admin;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminTable getAdmin() {
		return admin;
	}
	public void setAdmin(AdminTable admin) {
		this.admin = admin;
	}

}
