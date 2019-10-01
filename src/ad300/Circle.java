package ad300;

public class Circle {
	
	// Static data field
	private static int numberOfObjects = 0;
	
	// data field
	private double radius;
	
	// Initialize the circle object to have a defualt radius of 1
	public Circle() {
		radius = 1.0;
		numberOfObjects++;
	}
	
	// Initialize with custom radius
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	// Get the radius of the circle
	public double getRadius() {
		return radius;
	}
	
	// Get the area of the circle
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// Get the parameter of the circle
	public double getParameter() {
		return 2 * radius * Math.PI;
	}

	// Get the number of instances created
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	// Set the data field radius to a new radius
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
}
