package ad300;

/*
 * This is the class for rectangle objects
 * @author Lenny Brown
 */
public class Rectangle extends GeometricObject{
	
	// data field
	private double width;
	private double height;
	
	/*
	 * This is the constructor that gets passed no parameters. 
	 */
	public Rectangle() {
	
	}       
	 
	
	/*
	 * This is the constructor that gets passed both width and height. 
	 * It sets the width and height fields.
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/*
	 * This is the constructor that gets passed all parameters. 
	 * It sets the width and height fields, then passes color and filled
	 * to the super class to be set by the setX functions.
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 * @param color The color of the rectangle
	 * @param filled The filled status of the rectangle
	 */
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	/*
	 * This returns the width of the rectangle.
	 * @return The width of the rectangle
	 */
	public double getWidth() {
		return width;
	}
	
	/*
	 * This sets the width of the rectangle.
	 * @param The new width of the rectangle
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/*
	 * This returns the height of the rectangle.
	 * @return The height of the rectangle.
	 */
	public double getHeight() {
		return height;
	}
	
	/*
	 * This sets the height of the rectangle.
	 * @param The new height of the rectangle
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	/*
	 * This returns the area of the rectangle.
	 * @return The area of the rectangle
	 */
	public double getArea() {
		System.out.println(width * height);
		return width * height;
	}
	
	/*
	 * This returns the perimeter of the rectangle.
	 * @return The perimeter of the rectangle
	 */	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	/*
	 * This prints the descriptive rectangle info
	 */
	public void printRectangle() {
		System.out.println("The rectangle was created " + getDateCreated() +
				", the width is " + width + ", and the height is " + height);
	}
	
}
