package prac.ppss;

import java.sql.SQLException;

public class Maboto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerFactory cfact = CustomerFactory.getInstance();
		
		Customer clt = cfact.create(0,"firmin", "lastName");
		
		clt.setCity("city");
		clt.setStreet("street");
		
		try {
			cfact.insert(clt);
			System.out.println("Inserted ..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
