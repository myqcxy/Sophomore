package sd;

//package สตั้ศý;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Tom" , 18 , 'w');
		Student stu = new Student("Jack", 20,'w' , 201501);
		Teacher tea = new Teacher("Mary" , 40 , 'm', "Java");
		System.out.println(person.show());
		System.out.println(stu.show());
		System.out.println(tea.show());
	}

}
