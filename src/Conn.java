import java.sql.*;

public class Conn {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root","H@rSHiTR24");
			System.out.println("Connected Successfully");
		} catch (Exception E) {
			System.out.println(E);
			
		}
	}

}