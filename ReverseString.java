package demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		
		char[] ch= s.toCharArray();
		
		for(int i=0;i<ch.length/2;i++) {
			char t= ch[i];
			ch[i]= ch[ch.length-1-i];
			ch[ch.length-1-i]= t;
		}
		String nstr= new String(ch);
		System.out.println(nstr);

	}

}
