
public class Dog extends Pet{
	static final String sound = "汪-汪汪-汪汪汪";
	private String action = "看门";
	
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
		System.out.println("宠物狗信息为：");
		super.show();
		System.out.println(" 叫声：" + sound + " 特征：" + this.getAction());
	}

}
