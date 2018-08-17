package javaMock;

import java.util.Scanner;

public class GettingUserDefinedValue {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter int value");
		int a=scn.nextInt();
		System.out.println("Enter string value");
		String s=scn.next();

		System.out.println(a+" "+s);
	}

}
