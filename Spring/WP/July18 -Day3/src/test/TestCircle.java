package test;
import day3pack.Circle;
public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle(5,"Blue");
		System.out.println("Color for the circle object: "+c.getColor());
		System.out.println(c.radius);
	}

}
