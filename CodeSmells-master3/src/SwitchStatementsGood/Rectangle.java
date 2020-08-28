/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatementsGood;

/**
 *
 * @author gabpa
 */
public class Rectangle implements Shape{
	
	private double a;
	private double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	public double getArea(){
		return a*b;
	}
}
