package สตั้ศý;

public class Circle implements Shape {
	private double r;
	private final double PI = 3.14; 
	
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * r * r;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * PI * r;
	}
	

}
