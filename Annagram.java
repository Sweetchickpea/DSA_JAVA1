package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {
	
	public static void isAnnagram(String str1,String str2) {
		String S1= str1.replaceAll("/s", " ");
		String S2= str2.replaceAll("/s", " ");
		
		boolean status= true;
		
		if(S1.length()!=S2.length()) {
			status= false;
		}
		
		else {
			char[] s1= S1.toLowerCase().toCharArray();
			char[] s2= S2.toLowerCase().toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(status&&Arrays.equals(s1, s2)) {
				System.out.println("Strings are annagram");
			}
			else {
				System.out.println("not annagram");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1= sc.nextLine();
		System.out.println("enter another string");
		String str2= sc.nextLine();
		
		isAnnagram(str1,str2);

	}

}
