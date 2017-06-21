package com.sam.DAO;

import java.sql.*;

import javax.sql.*;

public class EmployeeDAOImp implements EmployeeDAO {
	
	private DataSource datasource;
	
	public void setDataSource(DataSource ds){
		this.datasource = ds;
	}

	public double getSal(int empno) {
		// TODO Auto-generated method stub
		Connection con = null;
		try{
			 con = datasource.getConnection();
			 PreparedStatement ps = con.prepareStatement("select salary from emp where empno=?");
			 ps.setInt(1, empno);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()){
				 return rs.getDouble(1);
			 }
			 
		}
		catch(Exception e){
			
		}
		return -1;
		
	}

	public void setSal(int empno, double sal) {
		
		Connection con = null;
		
		try{
			con = datasource.getConnection();
			
			PreparedStatement ps = con.prepareStatement("update emp set salary = ? where empno=?");
			ps.setDouble(1, sal);
			ps.setInt(2, empno);
			ps.executeUpdate();
		}
		catch(Exception e){
			
		}
		
	}

}
