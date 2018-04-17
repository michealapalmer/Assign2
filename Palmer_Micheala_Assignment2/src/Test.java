public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject gObjectArray [] = new GeometricObject [5];
		
		gObjectArray[0] = new Circle(5,5,5);
		gObjectArray[1] = new EquilateralTriangle(5);
		gObjectArray[2] = new Triangle(5,5,5);
		gObjectArray[3] = new Rectangle(5,5);
		gObjectArray[4] = new Square(5);
		
		printAreaAndPerimeter(gObjectArray);
		
		 }
		
		private static void printAreaAndPerimeter(GeometricObject[] gObject) {
	//print for all geometric objects, results based on test values
			for(int counter = 0; counter < gObject.length; counter++){
				System.out.println("\nArea:"+gObject[counter].getArea());
				System.out.println("Peremiter:"+gObject[counter].getPerimeter());
			}
			
	}

}
