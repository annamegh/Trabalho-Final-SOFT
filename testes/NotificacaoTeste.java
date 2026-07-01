package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import dados.Notificacao;

class NotificacaoTeste {

	@Test
	void testeEnviarNotificacao() {
		Notificacao n1 = new Notificacao ();
		
		boolean enviado = n1.enviar();
		
		assertTrue(enviado, "Notificação enviada com sucesso"); 
	}

}
