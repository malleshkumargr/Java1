package javaMock;

public class Variables {

	public static void main(String[] args) {
		int x=10;
		{
			int y=20;
			System.out.println(x);
			System.out.println(y);
			x=30;
		}

		System.out.println(x);
//		System.out.println(y);
	}

}
