import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

public class READFILE {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		String qurey = "select * from schoolproj. studentinf";
		StringBuilder st1=new StringBuilder();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("register");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=akash");
			pr = con.prepareStatement(qurey);
			System.out.println("paltform create");
			rs = pr.executeQuery(qurey);
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String Fname = rs.getString(3);
				String Mname = rs.getString(4);
				String Address = rs.getString(5);
				int cl = rs.getInt(6);
				long mobile = rs.getLong(7);
				Date date = rs.getDate(8);
				double pise = rs.getDouble(9);
				String cost = rs.getString(10);
				 StringBuilder sb = new StringBuilder();
				sb.append(rsmd.getColumnName(1));
				sb.append(',');
				sb.append(rsmd.getColumnName(2));
				sb.append(',');
				sb.append(rsmd.getColumnName(3));
				sb.append(',');
				sb.append(rsmd.getColumnName(4));
				sb.append(',');
				sb.append(rsmd.getColumnName(5));
				sb.append(',');
				sb.append(rsmd.getColumnName(6));
				sb.append(',');
				sb.append(rsmd.getColumnName(7));
				sb.append(',');
				sb.append(rsmd.getColumnName(8));
				sb.append(',');
				sb.append(rsmd.getColumnName(9));
				sb.append(',');
				sb.append(rsmd.getColumnName(10));
				sb.append('\n');
				sb.append(id);
				sb.append(',');
				sb.append(name);
				sb.append(',');
				sb.append(Fname);
				sb.append(',');
				sb.append(Mname);
				sb.append(',');
				sb.append(Address);
				sb.append(',');
				sb.append(cl);
				sb.append(',');
				sb.append(mobile);
				sb.append(',');
				sb.append(date);
				sb.append(',');
				sb.append(pise);
				sb.append(',');
				sb.append(cost);
				sb.append('\n');
				st1.append(sb);
				System.out.println(sb.toString());

			}
			PrintWriter pw = new PrintWriter(
					new File("F:\\J2ee\\progrms\\READ_DATA_FROM _DATABASE_STORED_INTO_CSV_FILE\\student.csv"));
			 pw.write(st1.toString());
			 pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pr != null) {
				try {
					pr.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
