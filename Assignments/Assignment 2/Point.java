public class Point
{
	 public Point(double xx, double yy, double zz)
	 {
	 x = xx;
	 y = yy;
	 z = zz;
	 }
	 
	 public double getX()
	 {
	 return x;
	 }
	 
	 public double getY()
	 {
	 return y;
	 }
	 
	 public double getZ()
	 {
	 return z;
	 }
	 
	 public double distance(Point p)
	 {
	 return Math.sqrt((x - p.x) * (x - p.x)
			+ (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
	 }
	 
private double x, y, z;
}