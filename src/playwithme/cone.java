package playwithme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class cone {
	public static void main(String[] args) {
		// selectst(2);
	}

	public static String statmenta;

	public static String selectst(int id) {

		try {
			// System.out.println("statmenta");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bluedb", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from res WHERE ID = '"
					+ id + "'");

			// Statement stmt = (Statement) con.createStatement();
			//
			// ResultSet rs = ((java.sql.Statement) stmt)
			//
			// .executeQuery("SELECT * from res Where ID = '" + id + "'");

			while (rs.next()) {

				statmenta = rs.getString("re");

			}
			con.close();

		} catch (Exception e) {
			System.out.println("e");

		}
		return statmenta;

	}
}
