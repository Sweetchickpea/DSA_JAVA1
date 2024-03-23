package demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,7,8,2,2,1};
		
		Set<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.print(no+" ");
		}

	}

}
