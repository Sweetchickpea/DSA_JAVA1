package demo;

import java.util.HashSet;
import java.util.Scanner;

public class PrintDupWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		
		
		String[] a= s.split(" ");
		
		HashSet<String>hs= new HashSet<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					hs.add(a[i]);
				}
			}
		}
		System.out.print(hs);

}}
