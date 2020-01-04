package org.bank.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlSrvDBConn {
	private Statement stmt;
	private Connection conn;
	private PreparedStatement pstmt;
	ResultSet rs;

	public SqlSrvDBConn() {
		stmt = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Bank", "sa", "741523");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs = null;
	}

	public Connection getConn() {
		return this.conn;
	}

	public PreparedStatement getPstmt() {
		return this.pstmt;
	}

	public ResultSet executeQuery(String sql) {

		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.err.println("Data.executeQuery:" + e.getMessage());
		}
		return rs;
	}

	public void closeStmt() {
		try {
			stmt.close(); // 关闭Statement对象
		} catch (SQLException e) {
			System.err.println("Data.executeQuery:" + e.getMessage());
		}

	}

	public void closeConn() {
		try {
			conn.close(); // 关闭连接
		} catch (SQLException e) {
			System.err.println("Data.executeQuery:" + e.getMessage());
		}
	}

}