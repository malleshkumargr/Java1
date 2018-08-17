package javaMock;

public class Static_Nonstatic {
	
	static int j=1;
	int k=2;
	
	static void m1(){
		System.out.println("Static method");
	    System.out.println(j);

	}
	
	void m2(){
		m1();
		System.out.println("Non static method");
		System.out.println(j);
		System.out.println(k);
	}

}
