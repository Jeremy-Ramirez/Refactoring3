/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClassGood;

/**
 *
 * @author gabpa
 */
public class Client {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		System.out.println(p1.distance(new Point(5,6)));
	}
}
