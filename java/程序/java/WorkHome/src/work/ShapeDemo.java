package work;

public class ShapeDemo implements Shape {
	private double r;
	
	public ShapeDemo(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * r * r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape  c = new ShapeDemo(1);
		System.out.println(c.area());
	}

}
