
public class Dog extends Pet{
	static final String sound = "��-����-������";
	private String action = "����";
	
	public Dog() {
	}

	public Dog(String varieties, String names, int age, char sex) {
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
		System.out.println("���ﹷ��ϢΪ��");
		super.show();
		System.out.println(" ������" + sound + " ������" + this.getAction());
	}

}
