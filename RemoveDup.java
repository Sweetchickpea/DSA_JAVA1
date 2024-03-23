package demo;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		
		String result=" ";
		
		for(int i=0;i<s.length();i++) {
			String st= " "+s.charAt(i);
			if(result.contains(st)) {
				continue;
			}
			result += st;
		}
		System.out.print(result);

	}

}
