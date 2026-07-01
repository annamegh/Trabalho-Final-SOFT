package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dados.Categoria;
import dados.Usuario;

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
		
		Usuario u1 = new Usuario(1L, "Anna", "anna@gmail.com", "abc");
		Categoria c1 = new Categoria(1L, "Limpeza");
		
		u1.getCategorias().add(c1);
		c1.excluir();
		
		assertEquals(0, u1.getCategorias().size(), "Categoria excluida com sucesso");
	}

}
