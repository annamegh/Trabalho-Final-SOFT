package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dados.Categoria;

class CategoriaTeste {

	@Test
	public void testeCadastrarCategoria() {
		
		Categoria c1 = new Categoria(1L, "Limpeza");
		
		c1.cadastrar();
		
		fail("Não implementado");
	}
	
	@Test
	public void testeAtualizarCategoria() {
			
		Categoria c1 = new Categoria(1L, "Limpeza");
		c1.atualizar();
		
		assertEquals("Saúde", c1.getNome());
	}
	
	@Test
	public void testeExcluirCategoria() {	
		
		Categoria c1 = new Categoria(1L, "Limpeza");
		
		c1.excluir();
		
		fail("Não implementado");
	}

}
