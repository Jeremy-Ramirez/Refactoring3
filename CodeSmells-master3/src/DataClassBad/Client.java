/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClassBad;

/**
 *
 * @author https://github.com/lee-dohm/code-smells
 */
public class Client {
	
	public static double distance(Point p1, Point p2){
		return Math.sqrt(Math.pow((p1.getCoordX()-p2.getCoordX()),2) +
				Math.pow((p1.getCoordY() - p2.getCoordY()),2));
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(5,3);
		
		System.out.println(distance(p1,p2));
	}
}
