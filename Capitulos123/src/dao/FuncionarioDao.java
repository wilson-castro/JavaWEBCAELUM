package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConnectionFactory;
import modelo.Funcionario;

public class FuncionarioDao {
	private Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionarios " +
	              "(nome,email,usuario,senha)" +
	              " values (?,?,?,?)";
		
		try {
	    	  
	    	  PreparedStatement stmt = connection.prepareStatement(sql);
	    	  stmt.setString(1, funcionario.getNome());
	    	  stmt.setString(2, funcionario.getEmail());
	    	  stmt.setString(3, funcionario.getUsuario());
	    	  stmt.setString(4, funcionario.getSenha());

	    	  stmt.execute();
	    	  stmt.close();
	    	  
	    	  this.connection.close();
	    	  
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	}
}
