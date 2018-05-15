package JdbcDemo;

import java.sql.*;

public class JDBCDemo1 {
	public JDBCDemo1(){
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String create_sql = "create table student1(id bigint,name varchar(120),";
		create_sql += "os decimal,math decimal,java decimal)";
		String driver = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:hsql://localhost";
		String user = "sa";
		String pass = "";
		Class.forName(driver);
		
		Connection con = null;
		Statement stmt = null;
		System.out.println("sdfds");
		try {
			con = DriverManager.getConnection(url,user,pass);
			stmt = con.createStatement();
		//	stmt.executeUpdate(create_sql);
			String sql = "insert into student1 values(6,'ÀîËÄ',89,76,79)";
			con.setAutoCommit(false);
			stmt.executeUpdate(sql);
			String []sqls = getBatchSqls();
		//	batchInsert(con,sqls);
			con.commit();
			query(stmt,"select *from student1");
		} finally{
			if(stmt!=null){
				stmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
	}

	private static void query(Statement stmt, String sql) throws SQLException {
		System.out.println();
		ResultSet rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i = 0;i<rsmd.getColumnCount();i++){
			System.out.printf("%6s", rsmd.getColumnName(i+1));
		}
		System.out.println();
		while(rs.next()){
			System.out.printf("%6s", rs.getString("ID"));
			System.out.printf("%6s",rs.getString("name"));
			System.out.printf("%6s",rs.getString("os"));
			System.out.printf("%6s",rs.getString("math"));
			System.out.printf("%6s",rs.getString("java"));
			System.out.println();
			
		}
		rs.close();
	}

	private static void batchInsert(Connection con, String[] sqls) throws SQLException {
		Statement stmt = null;
		try {
			con.setAutoCommit(false);
			stmt = con.createStatement();
			for(String sql:sqls){
				stmt.addBatch(sql);
			}
			stmt.executeBatch();
			con.commit();
		} catch (Exception e) {
			con.rollback();
		}finally{
			try {
				stmt.close();
			} catch (Exception e) {
				throw e;
			}
			con.setAutoCommit(true);
		}
		
	}

	private static String[] getBatchSqls() {
		String []sqls = new String[3];
		sqls[0] = "insert into student1 values(6,'lisi6',89,76,79)";
		sqls[1] = "insert into student1 values(7,'lisi7',89,76,79)";
		sqls[2] = "insert into student1 values(8,'lisi8',89,76,79)";
		
		return sqls;
	}

}
