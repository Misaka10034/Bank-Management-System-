package org.bank.test.action;

import java.sql.ResultSet;
import java.util.Map;

import org.bank.test.jdbc.SqlSrvDBConn;
import org.bank.test.jdbc.UserDao;
import org.bank.test.jdbc.UserDaoImpl;
import org.bank.test.model.vo.CustomerTable;

import com.opensymphony.xwork2.ActionContext;

public class SearchAction {
	CustomerTable customer = new CustomerTable();

	public CustomerTable getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerTable customer) {
		this.customer = customer;
	}

	public String execute() throws Exception {
		int id = customer.getId(); // 获取提交的用户名
		boolean validated = false;
		SqlSrvDBConn sqlsrvdb = new SqlSrvDBConn();
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession(); 
		CustomerTable customer1 = null;
		customer1 = (CustomerTable) session.get("customer");
		String sql = "select * from customer";
		ResultSet rs = sqlsrvdb.executeQuery(sql);
		// HttpSession httpSession = null;
		try {
			while (rs.next()) {
				if (rs.getInt("ID") == id) {
					customer1 = new CustomerTable();
					customer1.setId(rs.getInt(1));
					customer1.setEamil(rs.getString(6));
					customer1.setName(rs.getString(2));
					customer1.setIdnum(rs.getString(3));
					customer1.setPassword(rs.getString(4));
					customer1.setPhone(rs.getLong(5));
					customer1.setBalance(rs.getInt(7));
					session.put("tagcustomer", customer1);
					validated = true;
					break;
				} else
					validated = false;
			}
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sqlsrvdb.closeStmt();
		sqlsrvdb.closeConn();
		if(validated) return "SUCCESS";
		else return "ERROR";
	}
}
