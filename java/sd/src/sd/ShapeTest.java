package สตั้ศý;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Circle c = new Circle(1);
		Rectangle  r = new Rectangle(3,2);
		Triangle t = new Triangle(3 ,4,5);
		System.out.println(c.area() + " " + c.perimeter());
		System.out.println(r.area() + " " + r.perimeter());
		System.out.println(t.area() + " " + t.perimeter());*/
		Shape []s = new Shape[3];
		s[0] = new Circle(1);
		s[1] = new Rectangle(3,2);
		s[2] = new Triangle(3 ,4,5);
		for(int i = 0; i < 3;i++)
			System.out.println(s[i].area() + " " + s[i].perimeter());
		
	}

}
