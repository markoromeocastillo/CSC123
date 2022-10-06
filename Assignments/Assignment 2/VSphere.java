public class VSphere extends Sphere // Takes properties from Sphere and adds volume calculation.
{
	public VSphere(Point cntr, double rad)
	{
		super(cntr, rad);
	}
	
	public double volume()
	{
		return 4.0 * Math.PI * getRadius() * getRadius() * getRadius() / 3;
	}
	
}