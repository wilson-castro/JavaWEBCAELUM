package logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDao;
import modelo.Contato;

public class ListaContatosLogica {
	public String executa(HttpServletRequest req, HttpServletResponse res)
	          throws Exception {

	        List<Contato> contatos = new ContatoDao().getLista();

	        req.setAttribute("contatos", contatos);

	        return "lista-contatos.jsp";
	      }
}
