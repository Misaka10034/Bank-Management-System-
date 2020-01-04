package org.bank.test.jdbc;
import org.bank.test.model.vo.*;
public interface UserDao {
	public CustomerTable selectCustomerId(int customerid);
	public boolean delCustomer(int customerid);
	public boolean addUser(CustomerTable customer);
	//public boolean addUser(CustomerTable customer);
	public boolean updateCustomer(CustomerTable customer,int id);
	public boolean updateBalance(CustomerTable customer,float d);
}
