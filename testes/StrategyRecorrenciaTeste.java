package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import strategy.*;
import dados.Tarefa;

class StrategyRecorrenciaTeste {

	@Test
	void testeAplicarRecorrenciaAutomatica() {
		StrategyRecorrencia e1 = new RecorrenciaAutomatica();
		Tarefa t1 = new Tarefa(1L, "Limpeza", e1);
		
		assertEquals(t1.getEstrategia(), e1, "Estratégia de recorrência automática definida com sucesso");
	}
	
	@Test
	void testeAplicarRecorrenciaUnica() {
		StrategyRecorrencia e2 = new RecorrenciaUnica();
		Tarefa t1 = new Tarefa(1L, "Limpeza", e2);
		
		assertEquals(t1.getEstrategia(), e2, "Estratégia de recorrência única definida com sucesso");
	}

}
