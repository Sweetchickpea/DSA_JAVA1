package demo;

import java.util.Scanner;

public class ReverseCharInWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		String[] a= s.split(" ");
		
		String revString= " ";
		
		for(int i=0;i<a.length;i++) {
			String rev= a[i];
			String revWord= " ";
			for(int j=rev.length()-1;j>=0;j--) {
				revWord= revWord+rev.charAt(j);
			}
			revString= revString+revWord+" ";
			
			
		}
		System.out.println(revString);

	}

}
