package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.bean.Administrator;
import cn.dao.AdministratorDao;
import cn.dbc.BaseDao;

public class AdministratorDaoImpl implements AdministratorDao {
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	@Override
	public Administrator adminlogin(int id, String password) {
		Administrator admin=null;
		conn=bs.getConnection();
		if(conn!=null){
			String sql="select * from administrator where id=? and password=?";
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				pstmt.setString(2,password);
				rs=pstmt.executeQuery();
				if(rs.next()){
					admin=new Administrator();
					admin.setId(rs.getInt(1));
					admin.setName(rs.getString(2));
					admin.setPassword(rs.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				bs.closeConn(conn, pstmt, rs);
			}
		}
		return admin;
	}

}
