package Classes_de_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection faz_conec() throws SQLException{
		
		try {
			
			Class.forName("com.mysql.jbdc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_senhas","root","Otaviano2017");			
			
			
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());
			
		}
				

	}
}
