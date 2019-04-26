package Entidade;

public class Cadastro {

	public long id;
	public String nome;
	public String email;
	public String cidade;
	public String uf;
	
	public  long getId() {
		return id;
	}
	public  void setId(long id) {
		this.id = id;
	}
	public  String getNome() {
		return nome;
	}
	public  void setNome(String nome) {
		this.nome = nome;
	}
	public  String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public  String getCidade() {
		return cidade;
	}
	public  void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public  String getUf() {
		return uf;
	}
	public  void setUf(String uf) {
		this.uf = uf;
	}
}
