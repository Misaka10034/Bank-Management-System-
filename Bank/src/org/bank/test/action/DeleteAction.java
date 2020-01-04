package org.bank.test.action;

import org.bank.test.jdbc.UserDao;
import org.bank.test.jdbc.UserDaoImpl;
import org.bank.test.model.vo.CustomerTable;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	private CustomerTable customer;
	
	public String execute() throws Exception{
		UserDao userdao = new UserDaoImpl();
		try{
			userdao.delCustomer(customer.getId());
			return SUCCESS;
		}
		catch(Exception e) { 
			e.printStackTrace();
			return ERROR;
		}
	}

	public CustomerTable getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}
}
