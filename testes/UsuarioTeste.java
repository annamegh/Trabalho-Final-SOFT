package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dados.Usuario;



class UsuarioTeste {


	@Test
	public void testeCadastrarUsuario () {
		Usuario u1 = new Usuario (1L, "Anna", "anna@gmail.com", "abc");
		u1.cadastrar();
		
		fail("Não implementado");
	}
	
	@Test
	public void testeUsuarioLogado () {
		Usuario u1 = new Usuario (1L, "Anna", "anna@gmail.com", "abc");
		
		boolean logado = u1.login();
		
		assertTrue(logado, "Usuário logado");
	}

}
