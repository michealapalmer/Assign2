public class Square extends Rectangle {
	
	private double side;
	
/*	public Square(){
		
	} */

	public Square(double side) {
		// TODO Auto-generated constructor stub
		super();
		this.side = side;
	}

	
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side; //returns area of square
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}
}
