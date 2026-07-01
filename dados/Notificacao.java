package dados;

import java.time.LocalDate;

public class Notificacao {

	private String mensagem;
	private LocalDate dataEnvio;

	//MUDANÇA EM RELAÇÃO À UML
	public boolean enviar () {
		return true;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
}
