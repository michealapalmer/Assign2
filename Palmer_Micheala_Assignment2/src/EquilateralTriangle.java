public class EquilateralTriangle extends Triangle {

	private double side;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double a = (side*Math.pow(3, 0.5))/4;
		return a;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		
		return 3*side;
	}
	
	public EquilateralTriangle(double side){
		super(); //inherit from super class Triangle
		this.side = side;
	}

}
