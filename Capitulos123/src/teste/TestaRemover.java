package teste;

import dao.ContatoDao;
import modelo.Contato;

public class TestaRemover {
	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		
		contato.setId(2l);
		
		dao.remove(contato);
	}
}
