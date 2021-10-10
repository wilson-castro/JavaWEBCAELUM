package teste;

import java.util.Calendar;

import dao.ContatoDao;
import modelo.Contato;

public class TestaAlterar {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		 Contato contato = new Contato();
		 contato.setId(1l);
		  contato.setNome("wilson");
		  contato.setEmail("contato@caelum.com.br");
		  contato.setEndereco("R. Vergueiro 3185 cj57");
		  contato.setDataNascimento(Calendar.getInstance());	
	
		  dao.altera(contato);
	}
}
