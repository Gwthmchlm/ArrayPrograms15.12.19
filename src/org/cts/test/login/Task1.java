package org.cts.test.login;

public class Task1 {
public static void main(String[] args) {
	int a[]=new int[10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
	a[6]=7;
	a[7]=8;
	a[8]=9;
	a[9]=10;
	
	// to add the sum of all valued in the array
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum = sum+a[i];
		//System.out.println(sum);
	}
	System.out.println(sum);
	
	// to find the average values of array elements
	//int ln = a.length;
	//System.out.println(ln);
	int ave = sum/a.length;
	System.out.println(ave);
	
}
}
