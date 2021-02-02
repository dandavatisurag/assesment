package day1;

import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r,sum=0,temp;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
					
		}
		if(temp==sum)
			System.out.println("palindrome");
		else 
			System.out.println("not palindrome");

	}

}
