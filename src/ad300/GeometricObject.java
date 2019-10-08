package ad300;

/*
 * This is the class for geometric objects
 * @author Lenny Brown
 */
public class GeometricObject {
	
	// Data Fields
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/*
	 * This is the constructor that gets passed no parameters. 
	 * It sets the dateCreated field.
	 */
	public GeometricObject() {
		this.dateCreated = new java.util.Date();
	}
	
	/*
	 * This is the constructor that allows for setting the color and filled status.
	 * @param color The color of the object
	 * @param filled Whether the object is filled or not
	 * It calls GeometricObject()
	 */
	public GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	
	/*
	 * This returns the color of the object.
	 * @return The Color of the object
	 */
	public String getColor() {
		return this.color;
	}
	
	/*
	 * This method sets the color of the object.
	 * @param color The color you want the object set to
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/*
	 * This returns whether the object is filled or not.
	 * @return A boolean of whether the object is filled or not
	 */
	public boolean isFilled() {
		return this.filled;
	}
	
	/*
	 * This method sets the filled status of the object.
	 * @param filled The truth value of the filled status you want
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/*
	 * This gets the date that the object was created
	 * @return The date the object was created
	 */
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
	
	/*
	 * This method returns a formatted string describing the object.
	 * @return The descriptive formatted string for the object
	 */
	public String toString() {
		return "created on " + this.dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
}
