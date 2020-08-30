package InappropiateIntimicyBad;

import java.util.ArrayList;

public class Operadora {
	
	ArrayList<Linea>telephoneNumber;
	ArrayList<String> nameCliente;
	
	public String getTelephoneNumber(){
		for(Linea s:telephoneNumber) {
			String numeros=s.number;
		return numeros;
		}
		return null;
	}
	
}

