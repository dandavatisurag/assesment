package day1;

import java.util.Scanner;

public class colourcode {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter colour code");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'R':
			System.out.println("red");
			break;
		case 'B':
			System.out.println("blue");
			break;
		case 'G':
			System.out.println("green");
			break;
		case 'O':
			System.out.println("orange");
			break;
		case 'Y':
			System.out.println("yellow");
			break;
		default:
			System.out.println("invalid code");
			
		
		}
		
		
	}

}
