public class Sphere
{
	 public Sphere(Point cntr, double rad)
	 {
	 center = cntr;
	 radius = rad;
	 }

	 public Point getCenter()
	 {
	 return center;
	 }

	 public double getRadius()
	 {
	 return radius;
	 }
	 
	 public String toString()
	 {
		 return "Center: (" + center.getX() + ", " 
							+ center.getY() + ", "
							+ center.getZ() 
							+ ") Radius: " + radius;
	 }
	 
	 public boolean equals (Sphere s)
	 {
		 return center.getX() == s.center.getX()
		 &&		center.getY() == s.center.getY()
		 &&		center.getZ() == s.center.getZ()
		 &&		radius 	== s.radius;
	 }
		 
	 
private Point center;
private double radius;
}