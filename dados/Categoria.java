package dados;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private Long id;
	private String nome;
	
	private List<Tarefa> tarefas;
	
	public Categoria (Long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.tarefas = new ArrayList<Tarefa>();
	}
	
	public void cadastrar () {
		
	}
	
	public void atualizar () {
		this.nome = "Saúde";
	}
	
	public void excluir () {
		
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

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
