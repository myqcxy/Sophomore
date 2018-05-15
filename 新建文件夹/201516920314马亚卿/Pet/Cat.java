
public class Cat extends Pet{
	
	static final String sound = "喵-喵-喵";
	private String action = "抓老鼠";
	
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
		System.out.println("宠物猫信息为：");
		super.show();
		System.out.println(" 叫声：" + sound + " 特征：" + this.getAction());
	}
	
}
