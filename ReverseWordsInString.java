package demo;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		String[] a= s.split(" ");
		
		System.out.println("string before reverse");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("String after reverse");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
