package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import dados.Categoria;
import dados.PrazoNotificacao;
import dados.Tarefa;
import dados.UnidadePrazo;

class TarefaTeste {

	@Test
	public void testeCadastrarCTarefa (){
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		t1.cadastrar();
		
		fail("Não implementado");
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
		PrazoNotificacao p1 = new PrazoNotificacao(1L, 2, UnidadePrazo.MESES);
		
		t1.setPrazoNotificacao(p1);
		t1.atualizarPrazoNotificacao();
		
		assertEquals(LocalDate.of(2026, 12, 31), t1.getPrazoNotificacao().getDataNotificacao(), "Data da próxima notificação atualizada com sucesso");
	}

	@Test
	public void testeExcluir () {
		
		Categoria c1 = new Categoria(1L, "Limpeza");
		Tarefa t1 = new Tarefa(1L, "Limpeza");
		c1.getTarefas().add(t1);
		
		t1.excluir();
		
		assertEquals(0, c1.getTarefas().size(), "Tarefa excluida com sucesso");
	}
	
}
