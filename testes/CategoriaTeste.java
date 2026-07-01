package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dados.Categoria;

class CategoriaTeste {

	@Test
	public void testeCadastrarCategoria() {
		
		Categoria c1 = new Categoria(1L, "Limpeza");
				
		assertDoesNotThrow(() -> c1.cadastrar());
	}
	
	@Test
	public void testeAtualizarCategoria() {
			
		Categoria c1 = new Categoria(1L, "Limpeza");
		c1.atualizar();
		
		assertEquals(c1.getNome(), "Saúde", "Nome da Categoria atualizado com sucesso");
	}
	
	@Test
	public void testeExcluirCategoria() {
		
		Categoria c1 = new Categoria(1L, "Limpeza");		
		
		assertDoesNotThrow(() -> c1.excluir());	
	}

}
