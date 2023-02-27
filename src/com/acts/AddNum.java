package com.acts;

import java.util.Scanner;

public class AddNum {

	public static void main(String[] args) {
		int n1,n2,sum=0;
		System.out.println("Enter two Number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist Number");
		n1=sc.nextInt();
		System.out.println("Enter Secound Number");
		n2=sc.nextInt();
		sum=n1+n2;
		System.out.println("Addidtion of Two Numbers is  "+sum);
		sc.close();
	}

}
