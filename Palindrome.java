package demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1= sc.nextLine();
		
		char[] ch= str1.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp= ch[i];
			ch[i]= ch[ch.length-1-i];
			ch[ch.length-1-i]= temp;
		}
		
		String nstr= new String(ch);
		if(nstr.equalsIgnoreCase(str1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
