package SwitchStatementsBad;

public class AreaCalculator {
	
	
	public static double calculateArea(Shape shape){
		
		return shape.getArea();
	}
	
	public static void main(String[] args) {
		
		Square sq = new Square(2);
		Circle cc = new Circle(4);
		
		System.out.println(calculateArea(sq));
		System.out.println(calculateArea(cc));
	}
}
