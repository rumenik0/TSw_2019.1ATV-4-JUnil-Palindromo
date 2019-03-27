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
		str = str.replaceAll("[aáàãâä]","a");
		str = str.replaceAll("[?!]","");
		str = str.replaceAll("[ÂÀÁÄÃ]","A"); 
	    str = str.replaceAll("[âãàáä]","a"); 
	    str = str.replaceAll("[ÊÈÉË]","E"); 
	    str = str.replaceAll("[êèéë]","e"); 
	    str = str.replaceAll("ÎÍÌÏ","I"); 
	    str = str.replaceAll("îíìï","i"); 
	    str = str.replaceAll("[ÔÕÒÓÖ]","O"); 
	    str = str.replaceAll("[ôõòóö]","o"); 
	    str = str.replaceAll("[ÛÙÚÜ]","U"); 
	    str = str.replaceAll("[ûúùü]","u"); 
	    str = str.replaceAll("Ç","C"); 
	    str = str.replaceAll("ç","c");  
	    str = str.replaceAll("[ýÿ]","y"); 
	    str = str.replaceAll("Ý","Y"); 
	    str = str.replaceAll("ñ","n"); 
	    str = str.replaceAll("Ñ","N");
		return str;
	}
}
