package demo;

import java.util.HashSet;
import java.util.Scanner;

public class PrintDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		
		char[] ch= s.toCharArray();
		
		HashSet<Character>hs= new HashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					hs.add(ch[i]);
				}
			}
		
	}
		System.out.println(hs);	

	}}
