public class SphereDriver
{
	public static void main (String[] args)
	{
		Point a = new Point(1,2,3);
		Sphere s1 = new Sphere(a,5);
		Sphere s2 = new Sphere(a,5);
		
		System.out.println("Sphere 1: " + (s1));
		System.out.println("Sphere 2: " + (s2));
		
		if (s1.equals(s2)) //Checks object
			System.out.println("Sphere 1 is equal to Sphere 2");
		else
			System.out.println("Sphere 1 is not equal to Sphere 2");
		
		if (s1 == s2) // Checks reference
			System.out.print(" Both reference the same sphere.");
		else
			System.out.println("Both objects don't reference the same sphere.");
	}
}
