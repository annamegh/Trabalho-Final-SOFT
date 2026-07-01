package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import dados.DataRealizacao;

class DataRealizacaoTeste {

	@Test
	void testeCadastrarDataRealizacao() {
		DataRealizacao d1 = new DataRealizacao(1L, LocalDate.of(2026, 07, 01));
		
		assertDoesNotThrow(() -> d1.cadastrar());
	}
	
	@Test
	void testeAtualizarDataRealizacao() {
		DataRealizacao d1 = new DataRealizacao(1L, LocalDate.of(2026, 07, 01));
		
		d1.atualizar();
		
		assertEquals(d1.getData(), LocalDate.of(2026, 06, 25), "Data de realização da tarefa atualizada com sucesso");
	}

}
