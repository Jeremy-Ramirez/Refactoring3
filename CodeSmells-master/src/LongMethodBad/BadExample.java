/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethodBad;

/**
 *
 * @author gabpa
 */
public class BadExample {
	
	public static int doSomething(int a , int b){
		
		int baseA = a;
		int result1 = 1;
		while(baseA>0){
			result1 = result1 * baseA;
			baseA--;
		}
		
		int baseB = b;
		int result2 = 1;
		while(baseB>0){
			result2 = result2 *baseB;
			baseB--;
		}
		
		int final1 = result1 / 2;
		int final2 = result2 / 2;
		
		return final1 * final2;

	}
	
	public static void main(String[] args) {
		System.out.println(doSomething(2,3));
	}
}
