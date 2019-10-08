package ad300;

/*
 * This is the main class that runs stuff
 * @author Lenny Brown
 */
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to JAVA");
		
		Circle circle = new Circle(1);
	    System.out.println("A circle " + circle.toString());
	    System.out.println("The color is " + circle.getColor());
	    System.out.println("The radius is " + circle.getRadius());
	    System.out.println("The area is " + circle.getArea());
	    System.out.println("The diameter is " + circle.getDiameter());
	    
	    Rectangle rectangle = new Rectangle(2, 4);
	    System.out.println("\nA rectangle " + rectangle.toString());
	    System.out.println("The area is " + rectangle.getArea());
	    System.out.println("The perimeter is " + 
	    rectangle.getPerimeter());
	    
	    displayObject(new Circle(1, "red", false)); //invoke displayObject method
	    displayObject(new Rectangle(1, 1, "black", true));
	}
	
	/*
	 * This is a polymorphic method that takes a geometrical object
	 * and displays some details.
	 * @param object The instance of a geometric object
	 */
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor());
	}

}
