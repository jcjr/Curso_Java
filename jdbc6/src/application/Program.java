package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {

			conn = DB.getConnection();

			conn.setAutoCommit(false);

			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET "
							+ "BaseSalary = 5230 WHERE DepartmentId = 1");

			// Simulando falha na transação inicial
			/*
			 * int x = 1;
			 * 
			 * if (x < 2) { throw new SQLException("Fake error!!!"); }//
			 */			 

			int rows2 = st.executeUpdate("UPDATE seller SET "
							 + "BaseSalary = 3090 WHERE DepartmentId = 2");

			conn.commit();

			System.out.println("Done! Rows effected: " + rows1);
			System.out.println("Done! Rows effected: " + rows2);

		} catch (SQLException e) {

			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}

		} finally {

			DB.closeStatement(st);
			DB.closeConnection();

		}

	}

}
