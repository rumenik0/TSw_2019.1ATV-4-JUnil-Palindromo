package unico;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unico.Palindromo;

class PalindromoTeste {

	public Palindromo palindromo;
	
	@Test
	void testIsPalindromo() {
		
		palindromo = new Palindromo();
		String palavra = "AABAA";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoPar() {
		
		palindromo = new Palindromo();
		String palavra = "AABA";
		assertEquals(false, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoUmaLetra() {
		
		palindromo = new Palindromo();
		String palavra = "A";
		assertEquals(false, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoNull() {
		
		palindromo = new Palindromo();
		String palavra = null;
		assertEquals(false, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoEmpty() {
		
		palindromo = new Palindromo();
		String palavra = "";
		assertEquals(false, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoCaseSensitive() {
		
		palindromo = new Palindromo();
		String palavra = "Ireneri";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoEspaco() {
		
		palindromo = new Palindromo();
		String palavra = "A rua Laura";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}
	
	/*@Test
	void testIsPalindromoAcentuacao() {
		
		palindromo = new Palindromo();
		String palavra = "Após a Sopa";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}*/
	@Test
	void testIsPalindromoMultipleEspaco() {
		
		palindromo = new Palindromo();
		String palavra = "Apos    a      Sopa";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}
	@Test
	void testIsPalindromoPontuacao() {		
		palindromo = new Palindromo();
		String palavra = "A Daniela ama a lei? Nada!";
		assertEquals(true, palindromo.isPalindromo(palavra));
	}
	
	@Test
	void testIsPalindromoInvalido() {		
		palindromo = new Palindromo();
		String palavra = "Teste utilizando jUnit";
		assertEquals(false, palindromo.isPalindromo(palavra));
	}
}
