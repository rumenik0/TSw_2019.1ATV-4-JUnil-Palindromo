package unico;

public class Palindromo implements PalindromoInterface {

	@Override
	public boolean isPalindromo(String str) {
		
		if (str == null) return false;
		
		str = str.replaceAll(" ","");
		
		System.out.println(str);
		str = removeAcentuacao(str);
		System.out.println(str);
		char [] letras = str.toUpperCase().toCharArray();
		int tamanho = str.length();
		
		if (tamanho == 1) return false;
		if (tamanho % 2 == 0) return false ;
		
		for (int i=0; i < (tamanho -1)/2 ; i++) {
			if (letras[i] != letras[tamanho - 1 - i]) return false;
		}
		
		return true;
	}

	public static String removeAcentuacao(String str) { 
		str = str.replaceAll("[aבאדגה]","a");
		str = str.replaceAll("[?!]","");
		
		return str;
	}
}
