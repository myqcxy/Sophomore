package Pet;

public class Pet {
	
	private String varieties;
	private String name;
	private int age;
	private char sex;
	
	public Pet(String varieties,String names, int age, char sex) {
		this.setVarieties(varieties);
		this.setName(names);
		this.setAge(age);
		this.setSex(sex);
	}
	
	
	public Pet() {
	}


	public String getVarieties() {
		return varieties;
	}

	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}


	public void show(){
		
		System.out.print("品种：" + this.getVarieties() + "  姓名：" + this.getName() + "  性别：" + this.getSex() + "  年龄：" + this.getAge());
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age > 0 ? age:1;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
