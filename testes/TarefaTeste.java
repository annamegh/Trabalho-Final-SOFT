package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import dados.Tarefa;

class TarefaTeste {

	@Test
	public void testeCadastrarCTarefa (){
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		
		assertDoesNotThrow(() -> t1.cadastrar());
	}
	
	//MUDANÇA EM RELAÇÃO À UML
	@Test
	public void testeAtualizarNome () {
		Tarefa t1 = new Tarefa(1L, "Limpeza da janela");
		
		t1.atualizarNome();
		
		assertEquals("Limpeza das janelas", t1.getNome(), "Nome da tarefa atualizado com sucesso");
	}
	
	@Test
	public void testeAtualizarPrazoNotificacao () {
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		
		t1.atualizarPrazoNotificacao();
		
		assertEquals(LocalDate.of(2026, 12, 31), t1.getPrazoNotificacao().getDataNotificacao(), "Data da próxima notificação atualizada com sucesso");
	}

	@Test
	public void testeExcluir () {
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		
		assertDoesNotThrow(() -> t1.excluir());
	}
	
}
