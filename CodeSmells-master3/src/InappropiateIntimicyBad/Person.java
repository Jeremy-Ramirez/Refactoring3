/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimicyBad;

/**
 *
 * @author http://siloracle.blogspot.com/2014/11/code-smells-inappropriate-intimacy-with.html
 */
public class Person {
	String name;
	String officeAreaCode;
	String number;
	
	public String getTelephoneNumber(){
		return officeAreaCode + number;
	}
}
