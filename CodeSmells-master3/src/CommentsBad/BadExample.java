package CommentsBad;

public class BadExample {
	
	public static int multiplicarFactoriales(int a , int b){
		return factorial(a) * factorial(b);
	}
	
	public static int factorial(int num){
		
		int baseNum = num;
		int result = 1;
		
		while(baseNum>0){
			result = result * baseNum;
			baseNum--;
		}
		return result /2;
	}
	public static void main(String[] args) {
		System.out.println(multiplicarFactoriales(4,8));
	}
}
