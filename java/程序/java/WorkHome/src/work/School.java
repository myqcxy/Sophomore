package work;

public class School {
	private String name;
	private Address address;
	
	public School(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	public void show(){
		System.out.println(name);
		address.show();
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	static class Address{
		private String city;
		private String treet;
		public Address(String city, String treet) {
			super();
			this.city = city;
			this.treet = treet;
		}
		
		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getTreet() {
			return treet;
		}

		public void setTreet(String treet) {
			this.treet = treet;
		}

		public void show(){
			System.out.println("city:" + this.getCity() + "  street:" + this.getTreet());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("郑州","莲花街");
		School school  = new School("河南工业大学", address);
		school.show();
	}

}
