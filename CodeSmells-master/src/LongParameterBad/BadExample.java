/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongParameterBad;
import java.util.Random;
/**
 *
 * @author gabpa
 */
public class BadExample {
	
	
	public static boolean isApplicable(){
		int num = (new Random()).nextInt(2);
		return num == 0;	
	}
	
	public static double discount(){
		return (new Random()).nextDouble();
	}
	
	public static double shop(String objeto,boolean compraDentroMall, boolean aplica, double descuento, boolean terceraEdad){
		
		double precio = 20;
		if("celular".equals(objeto))
			precio = 100;
		
		if(compraDentroMall)
			precio = precio*2;
		
		if(aplica || terceraEdad)
			precio = precio - precio*descuento;
	
		return precio;
	}
	
	public static void main(String[] args) {
		boolean aplica = isApplicable();
		double descuento = discount();
		
		System.out.println(shop("celular",true,aplica,descuento,false));
	}
}
