package sd;

//package สตั้ศý;

public class Teacher extends Person {
		private String course;

		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Teacher(String name, int age, char sex, String course) {
			super(name, age, sex);
			this.course = course;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String show(){
			return super.show() + " "  + this.getCourse();
		}
		
}
