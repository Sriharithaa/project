package jdbc;
import java.sql.*;
class DBStored {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connec=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbookingsystem","root","170998@Sriss");
			Statement st=connec.createStatement();
			CallableStatement c=connec.prepareCall("{call get_customers()}");
			
			c.execute();
			ResultSet res=c.executeQuery();
			
			while(res.next()) {
				System.out.println("id: "+res.getInt(1)+"firstname " +res.getString(2)+"lastname " +res.getString(3)+"area: "+res.getString(4)+ "phone: "+res.getLong(5));                          
					
			}
		}
			catch(SQLException e) {
				System.out.println(e);
			}
			catch(ClassNotFoundException c) {
				c.printStackTrace();
			}
			
		}

	}


