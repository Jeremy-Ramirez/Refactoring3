
package LongMethodGood;

/**
 *
 * @author gabpa
 */
public class GoodExample {
	
	public static int doSomething(int a , int b){
		
		return recursion(a) * recursion(b);

	}
	
	public static int recursion(int num){
		
		int baseNum = num;
		int result = 1;
		
		while(baseNum>0){
			result = result * baseNum;
			baseNum--;
		}
		
		return result /2;
	}
	public static void main(String[] args) {
		System.out.println(doSomething(4,8));
	}
}
