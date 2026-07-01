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
		
		p1.cadastrar();
		
		fail("Não implementado");
	}
	
	@Test
	public void testeCalcularProxNotificacao () {
		PrazoNotificacao p1 = new PrazoNotificacao(1L, 2, UnidadePrazo.MESES);
		LocalDate d1 = p1.calcularProxNotificacao();
		
		assertEquals(LocalDate.of(2026, 12, 31), d1, "Data da próxima notificação calculada com sucesso");
	}

}
