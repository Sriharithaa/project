package sri;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class DataBase {


	private static final String CREATE_TABLE="CREATE TABLE user("+"user_ID int not null,"+"name varchar(50) not null,"+"product varchar(50) not null," +"primary key(user_ID))";
			
		                                                                          

	public static void main(String[] args)throws ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/ticketbookingsystem";
		String username="root";
		String password="170998@Sriss";
		Connection connect=null;
		PreparedStatement statement=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			connect=DriverManager.getConnection(url,username,password);
			statement=connect.prepareStatement(CREATE_TABLE);
			statement.executeUpdate();
			System.out.println("table is created");
			
		}
catch(SQLException e) {
	e.printStackTrace();
}
		finally
		{
			try {
				if(statement !=null) {
					statement.close();
					}
				if(connect !=null) {
					connect.close();
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
}	
					
				
			

	





