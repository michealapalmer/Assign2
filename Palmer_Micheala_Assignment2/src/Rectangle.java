public class Rectangle extends GeometricObject {
	
	private double side1;
	private double side2;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	   this.side1=1;
	   this.side1=2;
	  
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double s = (side1*side2);
		return s;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (side1+side2)*2;
	}
	
	public Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}

}
