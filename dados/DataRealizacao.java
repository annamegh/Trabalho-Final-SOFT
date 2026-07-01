package dados;

import java.time.LocalDate;

public class DataRealizacao {

	private Long id;
	private LocalDate data;
	
	public DataRealizacao (Long id, LocalDate data) {
		this.id = id;
		this.data = data;
	}
	
	public void cadastrar () {
		
	}
	
	public void atualizar () {
		this.data = LocalDate.of(2026, 06, 25);
	}
	
	public void excluir () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
