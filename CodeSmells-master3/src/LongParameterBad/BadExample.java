

package LongParameterBad;
import java.util.Random;


public class BadExample {
	
	
	public static boolean isApplicable(){
		int num = (new Random()).nextInt(2);
		return num == 0;	
	}
	
	public static double discount(){
		return (new Random()).nextDouble();
	}
	
	public static double shop(String objeto,boolean compraDentroMall, boolean terceraEdad){
		
		
		double precio = 20;
		if("celular".equals(objeto))
			precio = 100;
		
		if(compraDentroMall)
			precio = precio*2;
		
		if(isApplicable() || terceraEdad)
			precio = precio - precio * (discount());
	
		return precio;
	}
	
	public static void main(String[] args) {

		System.out.println(shop("celular",true,false));
	}
}
