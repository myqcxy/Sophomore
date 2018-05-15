package test;

import java.io.IOException;
import java.util.Scanner;

public class Student {
	private String ID;
	private String name;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String iD, String name, byte age) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
	public void InputInfo(){
		Scanner in = new Scanner(System.in);
	//	System.out.println(System.getProperty("file.encoding"));
		System.out.println(in.delimiter());
		while (true) {
			System.out.println("请输入学生ID：");
			try {
				String id = in.next();
				if(id.length() != 6){
					throw new StudentException();
				}
				this.setID(id);
				break;
			} catch (StudentException e) {
				System.out.println("ID错误，请重新输入：");
			} 
		}
		System.out.println("请输入学生姓名");
		in.nextLine();
		String name = in.next();
		this.setName(name);
		while (true) {
			System.out.println("请输入学生年龄：");
			try {
				int ag = 0;
					ag = in.nextInt();
					
				if(ag<0||ag>120){
					throw new StudentException();
				}
				this.setAge(ag);
				break;
			} catch (StudentException e) {
				System.out.println("年纪错误，请重新输入：");
			} catch(Exception e){
				in.nextLine();
			}
		}	
	}
	
	public String toString(){
		return ("学生信息为：" + " 学号：" + this.getID() + "  姓名：" + this.getName() + "   年龄：" + this.getAge());
	}
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.InputInfo();
		System.out.println(stu.toString());
	}

}
