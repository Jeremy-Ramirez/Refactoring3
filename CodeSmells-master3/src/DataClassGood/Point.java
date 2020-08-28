/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClassGood;

import DataClassBad.*;

/**
 *
 * @author gabpa
 */
public class Point {
	
	private double coordX;
	private double coordY;
	
	public Point(double x, double y){
		this.coordX = x;
		this.coordY = y;
		
	}

	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	
	public double distance(Point p){
		return Math.sqrt(Math.pow(this.coordX - p.getCoordX(),2) + Math.pow(this.coordY - p.getCoordY(),2));
	}
	
}
