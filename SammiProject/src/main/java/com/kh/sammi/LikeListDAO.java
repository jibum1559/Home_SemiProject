package com.kh.sammi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LikeListDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@61.83.168.218:1521:xe";
	private static final String jdbcUsername = "sm";
	private static final String jdbcPassword = "sm1234";
	
	public LikeListDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<LikeRealestate> getAllLikeRealestates(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 4); //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}
	
	public List<LikeRealestate> getApartmentType(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ? AND R.REALESTATE_TYPE = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 4);  //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ps.setString(2, "아파트"); //서블릿에서 만들어야하나?
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}

	public List<LikeRealestate> getVillaType(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ? AND R.REALESTATE_TYPE = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 5); //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ps.setString(2, "빌라"); //서블릿에서 만들어야하나?
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}

	public List<LikeRealestate> getOfficetelType(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ? AND R.REALESTATE_TYPE = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 4); //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ps.setString(2, "오피스텔"); //서블릿에서 만들어야하나?
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}
	
	public List<LikeRealestate> getStudioType(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ? AND R.REALESTATE_TYPE = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 6); //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ps.setString(2, "원룸"); //서블릿에서 만들어야하나?
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}

	public List<LikeRealestate> getHouseType(){
		List<LikeRealestate> LikeRealestates = new ArrayList<>();	
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			String sql = 
					"SELECT R.REALESTATE_NAME, R.REALESTATE_TYPE, R.REALESTATE_CONDITION, R.REALESTATE_SALEPRICE, R.REALESTATE_MONTHLY, R.REALESTATE_AREA, R.FLOORS " 
					+"FROM LIKELIST L "
					+"JOIN USERINFO U ON U.USER_ID = L.USER_ID "
					+"JOIN REALESTATEINFO R ON R.REALESTATE_ID = L.REALESTATE_ID "
					+"WHERE L.USER_ID = ? AND R.REALESTATE_TYPE = ?";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 6); //user_id 6의 자리에 로그인한 유저의 아이디 번호가 들어갈 수 있도록 설정
			ps.setString(2, "주택"); //서블릿에서 만들어야하나?
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				String realestateName = rs.getString("realestate_name");
				String realestateType = rs.getString("realestate_type");
				String realestateCondition = rs.getString("realestate_condition");
				int realestateSaleprice = rs.getInt("realestate_saleprice");
				int realestateMonthly = rs.getInt("realestate_monthly");
				int realestateArea = rs.getInt("realestate_area");
				String floors = rs.getString("floors");
				
				LikeRealestate realestate = new LikeRealestate(realestateName, realestateType, realestateCondition, 
															realestateSaleprice, realestateMonthly, realestateArea, floors);
				LikeRealestates.add(realestate);
				
			}
		} catch (SQLException e) {
			// ******찜한 매물이 없을 경우 찜한 매물이 없습니다 페이지로 전환*****
			e.printStackTrace();
		}
		return LikeRealestates;
	}
}