package org.bank.test.action;

import org.bank.test.model.vo.*;

import java.util.Map;

import org.bank.test.jdbc.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport{
	
	private CustomerTable customer;
	public CustomerTable getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method 
		UserDao userdao=new UserDaoImpl();
		
		try{			
			userdao.addUser(customer);
			return "SUCCESS";
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "ERROR";
		}
		
	}
}
