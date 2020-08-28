/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumpsBad;

import DataClassBad.*;

/**
 *
 * @author gabpa
 */
public class Point {
	
	private double X;
	private double Y;
	
	public Point(double x, double y){
		this.X = x;
		this.Y = y;
		
	}

	public double getCoordX() {
		return X;
	}

	public void setCoordX(double X) {
		this.X = X;
	}

	public double getCoordY() {
		return Y;
	}

	public void setCoordY(double Y) {
		this.Y = Y;
	}
	
	
}
