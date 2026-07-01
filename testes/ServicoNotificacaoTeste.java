package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import observer.ServicoNotificacao;

class ServicoNotificacaoTeste {

	@Test
    public void testeInstanciaUnicaServicoNotificacao() {
        ServicoNotificacao s1 = ServicoNotificacao.getInstance();
        ServicoNotificacao s2 = ServicoNotificacao.getInstance();
        
        assertSame(s1, s2, "A instância do Serviço Notificação é única");
    }

}
