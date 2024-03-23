package demo;

import java.util.Scanner;

public class PrintUniqueChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1= sc.nextLine();
		
		char[] ch= str1.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!='0') {
					count++;
					ch[j]='0';
				}
			}
			if(count>0&&ch[i]!='0') {
				System.out.print(" "+ch[i]);
			}
		}

	}

}

