package org.bank.test.action;

import java.sql.*;
import java.util.*;
import org.bank.test.model.vo.*;
import org.bank.test.jdbc.*;
import com.opensymphony.xwork2.*;

public class AdLoginAction extends ActionSupport {
	private AdminTable admin;
	private String adminpassword;
	private int adminid;

	public String execute() throws Exception {
		//System.out.println(admin.getId());
		int id = adminid; // 获取提交的用户名
		String pwd = adminpassword;
		boolean validated = false;
		SqlSrvDBConn sqlsrvdb = new SqlSrvDBConn();
//相较于用户登录删除了session,没有生成长期存储对象
		String sql = "select * from admin";
		ResultSet rs = sqlsrvdb.executeQuery(sql);
		try {
			while (rs.next()) {
				if (rs.getInt("ID") == id && rs.getString("Password").trim().compareTo(pwd) == 0) {
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
		sqlsrvdb.closeConn();
		if (validated) {
			return "success";
		} else {
			return "error";
		}
	}

	public AdminTable getadmin() {
		return admin;
	}

	public void setadmin(AdminTable admin) {
		this.admin = admin;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
}
