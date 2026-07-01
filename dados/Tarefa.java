package dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import strategy.StrategyRecorrencia;

public class Tarefa {

	private Long id;
	private String nome;
	private StrategyRecorrencia estrategia;
	
	private List<DataRealizacao> datasRealizacao;
	private PrazoNotificacao prazoNotificacao;
	
	public Tarefa (Long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.datasRealizacao = new ArrayList<DataRealizacao>();
	}
	
	public Tarefa (Long id, String nome, StrategyRecorrencia estrategia) {
		this.id = id;
		this.nome = nome;
		this.estrategia = estrategia;
		this.datasRealizacao = new ArrayList<DataRealizacao>();
	}
	
	public void cadastrar (){
		
	}
	
	//MUDANÇA EM RELAÇÃO À UML
	public void atualizarNome () {
		this.nome = "Limpeza das janelas";
	}
	
	//MUDANÇA EM RELAÇÃO À UML
	public void atualizarPrazoNotificacao () {
		this.prazoNotificacao.setDataNotificacao(LocalDate.of(2026, 12, 31));
	}
	
	public void excluir () {
		
	}
	
	public void notificarObservadores () {
		
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

	public StrategyRecorrencia getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(StrategyRecorrencia estrategia) {
		this.estrategia = estrategia;
	}

	public List<DataRealizacao> getDatasRealizacao() {
		return datasRealizacao;
	}

	public void setDatasRealizacao(List<DataRealizacao> datasRealizacao) {
		this.datasRealizacao = datasRealizacao;
	}

	public PrazoNotificacao getPrazoNotificacao() {
		return prazoNotificacao;
	}

	public void setPrazoNotificacao(PrazoNotificacao prazoNotificacao) {
		this.prazoNotificacao = prazoNotificacao;
	}
	
	
}
