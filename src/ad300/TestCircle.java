package ad300;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to JAVA");

		
		// Before creating objects
		System.out.println("There are " + Circle.getNumberOfObjects() + " instances of the Circle class \n");		 

		
		// Create a circle with radius 1 (default)
		Circle circle1 = new Circle();
		System.out.println("The area of circle1 with radius " + circle1.getRadius() + " is " + circle1.getArea());
		System.out.println("The Parameter of circle1 with radius " + circle1.getRadius() + " is " + circle1.getParameter() + "\n");


		// Create a circle with radius 25
		Circle circle2 = new Circle(25);
		System.out.println("The area of circle2 with radius " + circle2.getRadius() + " is " + circle2.getArea());
		System.out.println("The Parameter of circle2 with radius " + circle2.getRadius() + " is " + circle2.getParameter() + "\n");

		
		// Create a circle with radius 125
		Circle circle3 = new Circle(125);
		System.out.println("The area of circle3 with radius " + circle3.getRadius() + " is " + circle3.getArea());
		System.out.println("The Parameter of circle3 with radius " + circle3.getRadius() + " is " + circle3.getParameter() + "\n");


		
		// Modify the radius of circle2 to be 100 from 25
		circle2.setRadius(100);
		System.out.println("The area of circle2 with radius " + circle2.getRadius() + " is " + circle2.getArea());
		System.out.println("The Parameter of circle2 with radius " + circle2.getRadius() + " is " + circle2.getParameter() + "\n");
		
		// Print out the number of objects we've created
		System.out.println("There are " + Circle.getNumberOfObjects() + " instances of the Circle class");	
		
		System.out.println(circle2);
	}

}
