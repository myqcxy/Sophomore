
public class Cat extends Pet{
	
	static final String sound = "��-��-��";
	private String action = "ץ����";
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String varieties, String names, int age, char sex) {
		super(varieties, names, age, sex);
		// TODO Auto-generated constructor stub
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void show(){
		System.out.println("����è��ϢΪ��");
		super.show();
		System.out.println(" ������" + sound + " ������" + this.getAction());
	}
	
}
