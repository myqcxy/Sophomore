package สตั้ศý;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * (this.length + this.width);
	}

}
