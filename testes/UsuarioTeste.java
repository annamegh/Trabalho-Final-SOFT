package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dados.Usuario;



class UsuarioTeste {


	@Test
	public void testeCadastrarUsuario () {
		Usuario u1 = new Usuario (1L, "Anna", "anna@gmail.com", "abc");
		
		assertDoesNotThrow(() -> u1.cadastrar());
	}
	
	@Test
	public void testeUsuarioLogado () {
		Usuario u1 = new Usuario (1L, "Anna", "anna@gmail.com", "abc");
		
		boolean logado = u1.login();
		
		assertTrue(logado, "Usuário logado");
	}

}
