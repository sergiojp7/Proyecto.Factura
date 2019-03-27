package com.tarea01.datos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://192.168.99.100:32750/dbMarket";
			String usuario = "root";
			String password = "123456"; 

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, usuario, password);

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

		return conn;
	}

}
