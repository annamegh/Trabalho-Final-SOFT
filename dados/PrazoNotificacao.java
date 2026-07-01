package dados;

import java.time.LocalDate;

public class PrazoNotificacao {

	private Long id;
	private int quantidade;
	private UnidadePrazo unidade;
	private LocalDate dataNotificacao;
	
	public PrazoNotificacao (Long id, int quantidade, UnidadePrazo unidade) {
		this.id = id;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}
	
	public LocalDate calcularProxNotificacao () {
		return LocalDate.of(2026, 12, 31);
	}
	
	public void cadastrar () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public UnidadePrazo getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadePrazo unidade) {
		this.unidade = unidade;
	}

	public LocalDate getDataNotificacao() {
		return dataNotificacao;
	}

	public void setDataNotificacao(LocalDate dataNotificacao) {
		this.dataNotificacao = dataNotificacao;
	}
	
}
