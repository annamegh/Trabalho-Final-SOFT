package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import dados.PrazoNotificacao;
import dados.UnidadePrazo;

class PrazoNotificacaoTeste {

	@Test
	public void testeCadastrarPrazoNotificacao() {
		PrazoNotificacao p1 = new PrazoNotificacao(1L, 2, UnidadePrazo.MESES);
		
		assertDoesNotThrow(() -> p1.cadastrar());
	}
	
	@Test
	public void testeCalcularProxNotificacao () {
		PrazoNotificacao p1 = new PrazoNotificacao(1L, 2, UnidadePrazo.MESES);
		p1.calcularProxNotificacao();
		
		assertEquals(LocalDate.of(2026, 12, 31), p1.getDataNotificacao(), "Data da próxima notificação atualizada com sucesso");
	}

}
