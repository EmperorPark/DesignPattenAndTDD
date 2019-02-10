package Shape;

/**
 * Circle Class
 * @author woghkd0719
 * @see Shape
 */
public class Circle extends Shape {
	private int x,y,r;
	private Color color;
	
	public Circle(int x, int y, int r, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * if you want to copy circle instance. use this method.</br>
	 * </br>
	 * * One important Problem is copied members.</br>
	 * Because when java class is cloned(clone() method), basic data type(int, char, boolean etc...) is created new reference.</br>
	 * but object data type is copied original reference.(I guess it is java native.)</br>
	 * So we have to create new reference about object data type at class is cloned. 
	 * 
	 * @return Circle => x, y vaule + 1
	 * @throws CloneNotSupportedException
	 * @see Shape, Cloneable
	 */
	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();
		
		//Deep Copy
		//read method javadoc!!
		circle.color = new Color(circle.color.getR(), circle.color.getG(), circle.color.getB());
		
		circle.x += 1;
		circle.y += 1;
		return circle;
	}
	
}
