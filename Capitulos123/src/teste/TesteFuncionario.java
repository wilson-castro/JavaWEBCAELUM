package teste;

import dao.FuncionarioDao;
import modelo.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Wilson");
		funcionario.setEmail("Wilson@wilson.com");
		funcionario.setUsuario("Wilson-castro");
		funcionario.setSenha("123455");
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);
		
	}
}
