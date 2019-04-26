package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidade.Cadastro;

public class RepositorioCadastro implements IRepositorioCadastro {

	
	List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
	
	@Override
	public boolean salvarCadastro(Cadastro cadastro) {
		try {
		listaCadastro.add(cadastro);
		
		}catch(Exception erro) {
			return false;
		}
		return true;
	}

	@Override
	public boolean atualizarCadastro(Cadastro cadastro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cadastro> listarCadastro() {
		return listaCadastro;
	}

	@Override
	public boolean excluirCadastro(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
