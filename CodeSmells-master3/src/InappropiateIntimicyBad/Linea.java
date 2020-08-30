package InappropiateIntimicyBad;

public class Linea extends Operadora{
	String officeAreaCode;
	String number;
	
	public String getTelephoneNumber(){
		return officeAreaCode + number;
	}
	
}
