package demo;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1= sc.nextLine();
		char[] ch= str1.toCharArray();
		int count= 0;
		
		int n= ch.length;
		
		for(int i=0;i<n;i++) {
			count=1;
			for(int j=i+1;j<n;j++) {
				if(ch[i]==ch[j]) {
					count++;
					int k=j;
					while(k<n-1) {
						ch[k]=ch[k+1];
						k++;
					}
					n--;j--;
				}
			}
			System.out.println(ch[i]+" "+"occured"+" "+count+" "+"times");
		}
		

	}

}
