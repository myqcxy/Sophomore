package shiyan;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentTest {
	private long ID;
	private String name;
	private int age;	

	public StudentTest(long iD, String name, int age) {
		super();
		this.ID = iD;
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "学号：" + this.ID + "  姓名：" + this.name + "  年龄：" + this.age;
	}
	public static void main(String[] args) {
		long ID=0;
		String name=null;
		int age=0;
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			System.out.println("请输入学号：（输入“exit”退出）");
			while((line = reader.readLine())!=null){
				if(line.equalsIgnoreCase("exit"))
					return;
				try {
					ID = Long.parseLong(line);
				} catch (NumberFormatException e) {
					System.out.println("学号格式错误");
				}
				if(ID != 0)
					break;			
			}
		//	reader.readLine();
			System.out.println("请输入姓名：");
			name = reader.readLine();
			System.out.println("请输入年龄：（输入“exit”退出）");
			while((line = reader.readLine())!=null){
				
				if(line.equalsIgnoreCase("exit"))
					return;
				try {
					age = Integer.parseInt(line);
				} catch (NumberFormatException e) {
					System.out.println("年龄格式错误");
				}
				if(age <0&& age > 150){
					System.out.println("输入的年龄不正常");
					continue;
				}
				if(age != 0) break;		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new StudentTest(ID,name,age).toString());

	}

}
