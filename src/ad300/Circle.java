package ad300;

/*
 * This is the class for circle objects
 * @author Lenny Brown
 */
public class Circle extends GeometricObject{
	
	// data field
	private double radius;
	
	/*
	 * This is the constructor that gets passed no parameters. 
	 */
	public Circle () {        
	 
	}
	
	/*
	 * This is the constructor that gets passed only the radius. 
	 * It sets the radius field.
	 * @param radius The radius of the circle.
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/*
	 * This is the constructor that gets passed all parameters. 
	 * It sets the radius field, then passes color and filled
	 * to the super class to be set by the setX functions.
	 * @param radius The radius of the circle
	 * @param color The color of the circle
	 * @param filled The filled status of the circle
	 */
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	/*
	 * This returns the radius of the circle.
	 * @return The radius of the circle
	 */
	public double getRadius() {
		return radius;
	}
	
	/*
	 * This returns the diameter of the circle.
	 * @return The diameter of the circle
	 */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/*
	 * This sets the radius to a new radius
	 * @param radious The new radius
	 */
	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 0;
	}
	
	/*
	 * This returns the area of the circle.
	 * @return The area of the circle
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/*
	 * This returns the perimeter of the circle.
	 * @return The perimeter of the circle
	 */	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/*
	 * This prints the descriptive circle info
	 */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
				" and the radius is " + radius);
	}
	
	/*
	 * This method returns a formatted string describing the circle.
	 * @return The descriptive formatted string for the circle
	 */
	@Override
	public String toString() {
		return super.toString() + "\nradisu is " + radius;
	}
}
