package com.kh.sammi.backup.copy;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserIdCheckServlet")
public class UserIdCheckServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcURL = "jdbc:oracle:thin:@61.83.168.218:1521:xe";
	    String jdbcUsername = "sm";
		String jdbcPassword = "sm1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			
			String userid = request.getParameter("userid");
			String userpw = request.getParameter("password");
			
			String sql = "SELECT * FROM userinfo WHERE ID = ? AND PASSWORD = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setNString(1, userid);
			ps.setString(2, userpw);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("userid", rs.getString("id"));
				session.setAttribute("password", rs.getString("password"));
				
				response.sendRedirect("MyInfo.jsp");
			} else {
				request.setAttribute("message", "?��?��?�� ?��?�� 비�?번호�? ?���? ?��?��?��???��?��?��.");
			    RequestDispatcher rd = request.getRequestDispatcher("IdCheck.jsp");
			    rd.forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//response.sendRedirect("MyInfo.jsp");
			e.printStackTrace();
		}
	}

}