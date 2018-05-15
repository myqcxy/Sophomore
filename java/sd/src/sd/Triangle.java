package สตั้ศý;
import java.lang.Math;
public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double p = (this.a + this.b + this.c) / 2.0;
		return Math.sqrt( p * (p - this.a) * (p - this.b) * (p - this.c));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.a + this.b + this.c;
	}

}
