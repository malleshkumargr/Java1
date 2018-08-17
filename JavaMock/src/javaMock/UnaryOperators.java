package javaMock;

public class UnaryOperators {
	
	public static void main(String[] args) {
		int x=1;
		int y= (x++) + (x++);
		System.out.println("X values is "+x);
		System.out.println("Y values is "+y);
		int z= (++x) + (++x);
		System.out.println("X values is "+x);
		System.out.println("Z values is "+z);
		
		
		System.out.println(x++);
		System.out.println(++x);
		
		int x1;
		String y1;
		float  z1;
		double t1;
		
		/*System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		System.out.println(t1);
		*/
	}

}
