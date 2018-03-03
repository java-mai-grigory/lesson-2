
public class Points {

	public static void main(String[] args) {

		Point[] points = new Point[3];
		points[0] = new Point(0, 0);
		points[1] = new Point(1, 1);
		points[2] = new Point(2, 2);
		
		for(Point p : points)
			System.out.println(p.getX() + " " + p.getY()); 
	}

}
