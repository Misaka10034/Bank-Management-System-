package org.bank.test.action;

import java.util.Map;

import org.bank.test.jdbc.UserDao;
import org.bank.test.jdbc.UserDaoImpl;
import org.bank.test.model.vo.Balancechange;
import org.bank.test.model.vo.CustomerTable;

import com.opensymphony.xwork2.ActionContext;

public class BalanceAction {
	private Balancechange balancechange;

	public Balancechange getBalancechange() {
		return balancechange;
	}

	public void setBalancechange(Balancechange balancechange) {
		this.balancechange = balancechange;
	}

	public String execute() throws Exception {
		UserDao userdao = new UserDaoImpl();
		ActionContext context = ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		CustomerTable customer1 = (CustomerTable) session.get("tagcustomer");

		if (userdao.updateBalance(customer1, balancechange.getChange())) {
			return "SUCCESS";
		}

		else
			return "ERROR";
	}

}
