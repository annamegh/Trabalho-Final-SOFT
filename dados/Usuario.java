package dados;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Long id;
	private String nome;
	private String email;
	private String senhaHash;
	
	private List<Categoria> categorias;
	
	public Usuario (Long id, String nome, String email, String senhaHash) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senhaHash = senhaHash;
		this.categorias = new ArrayList<Categoria>();
	}
	
	public void cadastrar () {
		
	}
	
	public boolean login() {
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenhaHash() {
		return senhaHash;
	}

	public void setSenhaHash(String senhaHash) {
		this.senhaHash = senhaHash;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
}
