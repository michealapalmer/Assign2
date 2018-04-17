public class Circle extends GeometricObject {
	
	private double x;
	private double y;
	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
		//super();
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	
    public Circle(double x,double y,int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double a = 0.5*Math.PI*Math.pow(radius, 2);
		return a; //returns area of circle
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

//getter and setter constructors to receive user input
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	

}
