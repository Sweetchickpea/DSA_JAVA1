package demo;

import java.util.Scanner;

public class PrintUniqueWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		
		String[] a= s.split(" ");
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=1;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					count++;
					a[j]= "0";
				}
			}
			if(count>0&&a[i]!="0") {
				System.out.print(a[i]+" ");
			}
		}

	}

}
