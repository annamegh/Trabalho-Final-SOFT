package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import dados.DataRealizacao;
import dados.Tarefa;

class DataRealizacaoTeste {

	@Test
	void testeCadastrarDataRealizacao() {
		DataRealizacao d1 = new DataRealizacao(1L, LocalDate.of(2026, 07, 01));
		
		d1.cadastrar();
		
		fail("Não implementado");
	}
	
	@Test
	void testeAtualizarDataRealizacao() {
		DataRealizacao d1 = new DataRealizacao(1L, LocalDate.of(2026, 07, 01));
		
		d1.atualizar();
		
		assertEquals(d1.getData(), LocalDate.of(2026, 06, 25), "Data de realização da tarefa atualizada com sucesso");
	}
	
	@Test 
	void testeExcluirDataRealizacao() {
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		DataRealizacao d1 = new DataRealizacao(1L, LocalDate.of(2026, 07, 01));

		t1.getDatasRealizacao().add(d1);
		d1.excluir();
		
		assertEquals(0, t1.getDatasRealizacao().size(), "Data de realização da tarefa excluida com sucesso");
	}

}
