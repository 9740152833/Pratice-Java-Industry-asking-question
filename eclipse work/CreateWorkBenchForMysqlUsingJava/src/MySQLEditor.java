import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.ResultSetMetaData;

public class MySQLEditor {
	public static void main(String[] args) throws IOException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileInputStream f = new FileInputStream("F:\\J2ee\\progrms\\ReadPropeties\\src\\db.properties");
		Properties p = new Properties();
		try {
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Class.forName(p.getProperty("driver"));
			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));
			stmt = con.createStatement();
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Editor Started, connect to db");
			while (true) {
				System.out.println("\nSQL>");
				String qurey = dis.readLine();
				boolean flag = stmt.execute(qurey);
				if (flag) {
					rs = stmt.getResultSet();
					ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						System.out.println(rsmd.getColumnName(i));
					}
					System.out.println();
					System.out.println("----------------------------");
					while (rs.next()) {
						for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						} // for
						System.out.println();
					} // while
				} // if
				else {
					int count = stmt.getUpdateCount();
					System.out.println(count + "no(s) of records has been effected by this qurey");

				} // else
			} // while

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
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
