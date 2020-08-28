/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommentsBad;

/**
 *
 * @author gabpa
 */
public class BadExample {
	
	public static int doSomething(int a , int b){
		
		int baseA = a;//Store base value of a
		int result1 = 1; //Result of recursion
		
		//factorial of A
		while(baseA>0){
			result1 = result1 * baseA;
			baseA--;
		}
		
		int baseB = b;  //Store base value of b
		int result2 = 1; //Result of recursion
		
		//factorial of B
		while(baseB>0){
			result2 = result2 *baseB;
			baseB--;
		}
		
		//Final values to be returned
		int final1 = result1 / 2;
		int final2 = result2 / 2;
		
		return final1 * final2;

	}
	
	public static void main(String[] args) {
		System.out.println(doSomething(2,3));
	}
}
