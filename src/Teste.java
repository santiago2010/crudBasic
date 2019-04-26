import java.util.ArrayList;
import java.util.List;
import Entidade.Cadastro;
import Repositorio.RepositorioCadastro;

public class Teste {
	static RepositorioCadastro rc = new RepositorioCadastro();
	
	public static void main(String[] args) {

		cadastroArray();
		listarCadastro();
	}
	
	static void cadastroArray() {
		
		Cadastro cadastro1 = new Cadastro();

		
		cadastro1.setNome("Santiago");
		cadastro1.setEmail("daniel.santiagoti@gmail.com");
		cadastro1.setId(1);
		cadastro1.setCidade("Belo Horizonte");
		cadastro1.setUf("MG");
		rc.salvarCadastro(cadastro1);
		
		Cadastro cadastro2 = new Cadastro();
		cadastro2.setNome("Diogo");
		cadastro2.setEmail("diogo.santiagoti@gmail.com");
		cadastro2.setId(2);
		cadastro2.setCidade("Belo Horizonte");
		cadastro2.setUf("MG");
		rc.salvarCadastro(cadastro2);
		
		Cadastro cadastro3 = new Cadastro();
		cadastro3.setNome("Maria");
		cadastro3.setEmail("maria.santiagoti@gmail.com");
		cadastro3.setId(25);
		cadastro3.setCidade("Belo Horizonte");
		cadastro3.setUf("MG");
		rc.salvarCadastro(cadastro3);
	}
	
	static void listarCadastro (){
		
		List<Cadastro> lista = rc.listarCadastro();
		
		for (Cadastro cadastro : lista) {
			
			System.out.println("ID: " +cadastro.getId());
			System.out.println("Nome: " +cadastro.getNome());
			System.out.println("Cidade: "+cadastro.getCidade());
			System.out.println("UF: " + cadastro.getUf());
			System.out.println("Email: " + cadastro.getEmail());
			
		}
		
	}
	
}
