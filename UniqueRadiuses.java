/*
 * Given a set of 3D points and the formula for the radius of a sphere 
 * R = sqrt(x^2 + y^2 + z^2), return the number of points with unique radiuses.
 */

import java.util.ArrayList;

class Point3D {
  public int x;
  public int y;
  public int z;
}

public class UniqueRadiuses {
	
	
	public static void main(String[] args){
		Point3D a = new Point3D();
		a.x = 0;
		a.y = 5;
		a.z = 4;
		
		Point3D b = new Point3D();
		b.x = 0;
		b.y = 0;
		b.z = -3;
		
		Point3D c = new Point3D();
		c.x = -2;
		c.y = 1;
		c.z = -6;
		
		Point3D d = new Point3D();
		d.x = 1;
		d.y = -2;
		d.z = 2;
		
		Point3D e = new Point3D();
		e.x = 1;
		e.y = 1;
		e.z = 1;
		
		Point3D f = new Point3D();
		f.x = 4;
		f.y = -4;
		f.z = 3;
		
		Point3D[] points = {a, b, c, d, e, f};
		
		System.out.println(solution2(points));
	}
	 public static int solution2(Point3D[] A) {
		 double[] radius = new double[A.length];
		 for(int i=0; i<A.length; i++) {
			 radius[i] = Math.sqrt(Math.pow(A[i].x, 2)+Math.pow(A[i].y, 2)+Math.pow(A[i].z, 2));
		 }
		 ArrayList<Double> unique = new ArrayList<>();
		 
		 for(int i=0; i<radius.length; i++) {
			 if(!unique.contains(radius[i]))
				 unique.add(radius[i]);
		 }

		 return unique.size();
	        // write your code in Java SE 8
	    }
}
