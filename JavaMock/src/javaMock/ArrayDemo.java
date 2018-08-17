package javaMock;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		/*double d[] = new double[5];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter double values");
		for(int i=0;i<d.length;i++){
			d[i]=scn.nextDouble();
		}
		System.out.println("Read double values");
		for(int j=0;j<d.length;j++){
			System.out.println(d[j]);
		}*/
		
		int a[] = {10,50,20,60};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}

		System.out.println();
	
	int x[] = {1, 2, 3};
	int y[] = {4, 5, 6};
	int z[] = new int[x.length+y.length];
	
	for(int i=0;i<x.length;i++){
		z[i] = x[i];
	}
	
	int p = x.length;
	
	for(int j=0;j<y.length;j++){
		z[p+j] = y[j];
	}

	for(int q:z){
		System.out.print(q+" ");
	}
 }
}
