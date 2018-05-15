public class Commodity{
	double price;
	String name;
	String dateOfMake;
	String dateOfSafe;
	Commodity(double pri,String na,String make,String safe)
	{
		setPrice(pri);
		setName(na);
		setMake(make);
		setSafe(safe);
	}
	void setPrice(double pri)
	{
		price = pri > 0 ? pri : 0; 
	}
	void setName(String na)
	{
		name = na;
	}
	void setMake(String make)
	{
		dateOfMake = make;
	}
	void setSafe(String safe)
	{
		dateOfSafe = safe;
	}
	double getPrice()
	{
		return price;
	}
	String getName()
	{
		return  name;
	}
	String getMake()
	{
		return dateOfMake;
	}
	String getSafe()
	{
		return dateOfSafe;
	}
}