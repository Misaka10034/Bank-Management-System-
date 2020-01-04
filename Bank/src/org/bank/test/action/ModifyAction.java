package org.bank.test.action;

import java.util.Map;

import org.bank.test.jdbc.UserDao;
import org.bank.test.jdbc.UserDaoImpl;
import org.bank.test.model.vo.CustomerTable;
import com.opensymphony.xwork2.ActionSupport;

public class ModifyAction extends ActionSupport {
	private CustomerTable customer = new CustomerTable();

	public CustomerTable getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}

	public String execute() throws Exception {
		UserDao userdao = new UserDaoImpl();
		if((customer.getEamil()==null)||(customer.getPhone()==0)||(customer.getPassword()==null))
			return ERROR;
		try {
			userdao.updateCustomer(customer, LoginAction.globalid);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;// 没办法过滤空值,缺陷之一,还有用户注册完不显示id,缺陷2
		}
	}
}
