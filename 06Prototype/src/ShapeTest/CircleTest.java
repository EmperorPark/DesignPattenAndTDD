package ShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Shape.Circle;
import Shape.Color;
import Shape.Shape;

/**
 * Basic Test </br>
 * write {@link Shape} -> write {@link CircleTest} -> write & execute {@link #shapeTest()} : fail</br>
 * -> write {@link Circle} -> execute {@link #shapeTest()} : success -> write & execute {@link Main}</br>
 * -> modify {@link #shapeTest()}(expected x, y value + 1)-> execute {@link #shapeTest()} : fail -> modify {@link Circle}</br>
 * ->  execute {@link #shapeTest()} : success -> execute {@link Main}</br>
 * </br>
 * Deep copy Test </br>
 * -> write & execute {@link #colorTest()} : fail -> write {@link Color}  -> modify {@link Circle} -> execute {@link #colorTest()} : success</br>
 * -> modify & execute {@link Main}
 * @author woghkd0719
 * @see Circle
 */
class CircleTest {

	@Test
	void shapeTest() throws CloneNotSupportedException {
		Circle circle1 = new Circle(0,0,5, new Color(0, 0, 0));
		
		Circle circle2 = circle1.copy();
		
		assertEquals(circle1.getX() + 1, circle2.getX());
		assertEquals(circle1.getY() + 1, circle2.getY());
		assertEquals(circle1.getR(), circle2.getR());
		
		
		
	}
	
	@Test
	void colorTest() throws CloneNotSupportedException {
		Circle circle1 = new Circle(0,0,5, new Color(0, 0, 0));
		
		Circle circle2 = circle1.copy();
		
		//new instance(ref)
		assertNotEquals(circle1.getColor(), circle2.getColor());
		
		//member value(val)
		assertEquals(circle1.getColor().getR(), circle2.getColor().getR());
		assertEquals(circle1.getColor().getG(), circle2.getColor().getG());
		assertEquals(circle1.getColor().getB(), circle2.getColor().getB());
	}

}
