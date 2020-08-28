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
public class Square implements Shape{

	private double a;

	public Square(double a) {
		this.a = a;
	}
	
	@Override
	public double getArea() {
		return a * a;
	}
	
}
