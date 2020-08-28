/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimicyGood;

/**
 *
 * @author gabpa
 */
public class Telephone {
	
	String officeAreaCode;
	String number;
	
	public String getTelephoneNumber(){
		return officeAreaCode + number;
	}
}
