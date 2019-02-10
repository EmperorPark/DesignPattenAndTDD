import Shape.Circle;
import Shape.Color;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(0, 0, 6, new Color(255, 255, 255));
		Circle circle2 = circle1.copy();
		
		System.out.println(
				circle1.getX()+","+
				circle1.getY()+","+
				circle1.getR()+"|"+
				circle1.getColor().getR()+","+
				circle1.getColor().getG()+","+
				circle1.getColor().getB());
		
		System.out.println(
				circle2.getX()+","+
				circle2.getY()+","+
				circle2.getR()+"|"+
				circle1.getColor().getR()+","+
				circle1.getColor().getG()+","+
				circle1.getColor().getB());
	}
}
