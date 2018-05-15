package sd;

//package ʵ����;

public class Student extends Person {
		private int id;

		public Student(String name, int age, char sex, int id) {
			super(name, age, sex);
			this.id = id;
		}

		public Student() {
			super();
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String show(){
			return super.show() + " " +  this.getId();
		}
}
