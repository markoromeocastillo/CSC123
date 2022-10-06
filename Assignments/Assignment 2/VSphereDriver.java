public class VSphereDriver
{
	public static void main(String[] args)
	{
		VSphere v = new VSphere(new Point(1,2,3), 5);
		System.out.println("Volume: "+ v.volume());
	}
}