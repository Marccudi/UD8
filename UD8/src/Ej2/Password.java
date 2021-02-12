package Ej2;
import java.util.Random;

public class Password {
	public int longitud=8;
	public String contressenya;
	
	
	public Password() {
		
	}
	
	public Password(int longitud) {
		this.longitud = longitud;

		int limiteIzq=97;//Letra a
		int limiteDer=122;//Letra z
	    Random random = new Random();
	    String generatedString = random.ints(limiteIzq, limiteDer + 1)
	    	      .limit(longitud)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();
		this.contressenya=generatedString;
		
		
	}

	
}
