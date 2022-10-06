public class AutoDriver
{
	public static void main(String[] args)
	{
	Auto none = new Auto();	
	Auto roy = new Auto ("Ford", "Mustang", 2018, 23000, "1ZBA532");
	AutoCondition bob =  new AutoCondition ("Tesla", "ModelS", 2017, 33000, "654kjh545", "Damaged");
	
	System.out.println("Car Details: " + none);
	System.out.println("Car Details: " + roy);
	System.out.println("Car Details: " + bob);
	// System.outprintln(roy);
	
	}
}