package Repositorio;
import java.util.List;
import Entidade.Cadastro;

public interface IRepositorioCadastro {

	
	public boolean salvarCadastro(Cadastro cadastro);
	public boolean atualizarCadastro(Cadastro cadastro);
	public List <Cadastro> listarCadastro();
	public boolean excluirCadastro(long id);
}
