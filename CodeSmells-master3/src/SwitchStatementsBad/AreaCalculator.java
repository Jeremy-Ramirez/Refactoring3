/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatementsBad;

/**
 *
 * @author https://hanuska.blogspot.com/2006/08/swich-statement-code-smell-and.html
 */
public class AreaCalculator {
	
	private static double a;
	private static double b;
	private static double r;
	
	public static double area(int shape){
		double area = 0;
		switch(shape){
			
			case 1: //Cuadrado
				area = a * a;
			case 2: //Rectangulo
				area = a* b;
			case 3: //Circulo
				area = Math.PI * r * r;
			
		}
		return area;
	}
}


