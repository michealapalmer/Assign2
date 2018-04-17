public abstract class GeometricObject {
	private String color = "white";
	 private boolean filled;
	 private java.util.Date dateCreated;
	 // Construct a default geometric object 
	 protected GeometricObject() {
	 dateCreated = new java.util.Date();
	 }
	 //Construct a geometric object with color and filled value
	 protected GeometricObject(String color, boolean filled) {
	 dateCreated = new java.util.Date();
	 this.color = color;
	 this.filled = filled;
	 }
	 // constructors to get and set with a return value
	 public String getColor() {
	 return color;
	 }
	
	 public void setColor(String color) {
	 this.color = color;
	 }
	 // Return filled if it is true 
	 public boolean isFilled() {
	 return filled;
	 }
	 //Set a new filled
	 public void setFilled(boolean filled) {
	 this.filled = filled;
	 }
	 //Get dateCreated 
	 public java.util.Date getDateCreated() {
	 return dateCreated;
	 }
	 @Override
	 public String toString() {
	 return "created on " + dateCreated + "\ncolor: " +
	color +  " and filled: " + filled;
	 }
	 // abstract method getArea 
	 public abstract double getArea();
	 // abstract method getPerimeter 
	 public abstract double getPerimeter();
	}

class Triangle extends GeometricObject {
	 private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	 /** Constructor */
	 public Triangle() {
	 }
	 /** Constructor */
	 public Triangle(double side1, double side2, double
	side3) {
	 this.side1 = side1;
	 this.side2 = side2;
	 this.side3 = side3;
	 }
	 // Override method findArea in GeometricObject 
	 public double getArea() {
	 double s = (side1 + side2 + side3) / 2;
	 return Math.sqrt(s * (s - side1) * (s - side2) * (s -side3));
	 }
	 // Override method findPerimeter in GeometricObject 
	 public double getPerimeter() {
	 return side1 + side2 + side3;
	 }
	 // override the toString method 
	 public String toString() {
	 // Implement method to return the three sides
	 return "Triangle: side1 = " + side1 + " side2 = " +
	side2 +  " side3 = " + side3;
	 }
	}
