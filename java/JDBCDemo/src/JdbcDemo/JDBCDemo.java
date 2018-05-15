package JdbcDemo;

import java.sql.*;

public class JDBCDemo {
	String driver = "org.hsqldb.jdbcDriver";
	String url = "jdbc:hsqldb:hsql://localhost";
	String user = "sa";
	String pass = "";
	private Connection con;
	public void init() throws ClassNotFoundException, SQLException{
		if(con!=null) return;
		Class.forName(driver);
		
		con = DriverManager.getConnection(url,user,pass);
	}
	public void close() throws SQLException{
		if(con!=null)
			con.close();
	}
	public void initTable() throws SQLException{
		String sql = "create table stu(id bigint,name varchar(120),";
		sql+="os decimal,math decimal,java decimal)";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		sql = "insert into stu values(1,\'zhangsan\',89,78,67)";
		stmt.executeUpdate(sql);
		sql = "insert into stu values(2,\'li si\',92,74,86)";
		stmt.executeUpdate(sql);
		sql = "insert into stu values(3,\'wang wu\',89,78,66)";
		stmt.executeUpdate(sql);
		sql = "insert into stu values(4,\'liuliu\',89,78,66)";
		stmt.executeUpdate(sql);
		stmt.close();
	}
	public void query() throws SQLException{
		Statement stmt = con.createStatement();
		String sql = "select *from stu";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			String id = rs.getString("id");
			String name = rs.getString("name");
			String math = rs.getString("math");
			String os = rs.getString("os");
			String java = rs.getString("java");
			System.out.printf("%s,%s,%s,%s,%s%n",id,name,math,os,java);
		
		}
		rs.close();
		stmt.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBCDemo demo = new JDBCDemo();
		demo.init();
		demo.initTable();
		demo.query();
		demo.close();

	}

}
