package org.bank.test.jdbc;

import org.bank.test.model.vo.AdminTable;
import org.bank.test.model.vo.CustomerTable;

import org.bank.test.jdbc.*;
import java.sql.*;

public class UserDaoImpl implements UserDao {
	// public SqlSrvDBConn SqlsrvConn = new SqlSrvDBConn();
	private CustomerTable customer;
	private AdminTable admin;
	CustomerTable customer1 = null;
	AdminTable admin1 = null;
	SqlSrvDBConn sqlsrvdb = new SqlSrvDBConn();
	PreparedStatement pstmt = sqlsrvdb.getPstmt();
	Connection conn = sqlsrvdb.getConn();

	@Override
	public CustomerTable selectCustomerId(int customerid) {
		String sql = "select * from customer where ID = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		CustomerTable customer = new CustomerTable();

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, customerid);
			rs = ps.executeQuery();
			if (rs.next()) {
				customer.setId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setIdnum(rs.getString(3));
				customer.setPassword(rs.getString(4));
				customer.setPhone(rs.getLong(5));
				customer.setEamil(rs.getString(6));
				customer.setBalance(rs.getInt(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsrvdb.closeConn();
		}
		return customer;
	}

	@Override
	public boolean delCustomer(int customerid) {
		String sql = "delete from customer where id = ?";
		PreparedStatement ps = null;
		int count = 0;
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, customerid);
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsrvdb.closeConn();
		}

		if (count > 0)
			return true;
		else
			return false;

	}

	@Override
	public boolean addUser(CustomerTable customer) {
		String sql = "insert into customer values(?,?,?,?,?,?)"; // 插入用户
		/** 设置用户信息各字段值 */
//		ResultSet rs=sqlsrvdb.executeQuery(sql);
//		int count = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getIdnum());
			pstmt.setString(3, customer.getPassword());
			pstmt.setLong(4, customer.getPhone());
			pstmt.setString(5, customer.getEamil());
			pstmt.setFloat(6, customer.getBalance());
			pstmt.executeUpdate(); // 执行插入操作
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCustomer(CustomerTable customer, int id) {

		String sql = "update  customer  set Password = ?, PhoneNum =  ?,Email = ? where ID =?";
		PreparedStatement ps = null;
		int count = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getPassword());
			ps.setLong(2, customer.getPhone());
			ps.setString(3, customer.getEamil());
			ps.setInt(4, id);
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsrvdb.closeConn();
		}
		if (count > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateBalance(CustomerTable customer,float balancechange) {
		String sql = "update  customer  set Balance = ? where ID =?";
		PreparedStatement ps = null;
		int count = 0;
		try {
				if (customer.getBalance() +balancechange >= 0) {
					customer.setBalance(customer.getBalance() + balancechange);
				} else
					return false;
			ps=conn.prepareStatement(sql);
			ps.setFloat(1, customer.getBalance());
			ps.setLong(2, customer.getId());
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsrvdb.closeConn();
		}
		if (count > 0)
			return true;
		else
			return false;
	}

}
