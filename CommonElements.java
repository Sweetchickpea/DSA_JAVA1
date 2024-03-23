
package demo;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,1,1,6,7};
		int[] b= {2,2,1,3,6};
		
		Set<Integer> hs= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==a[j]) {
					hs.add(a[i]);
				}
			}
		}
		for(int no:hs) {
			System.out.print(no+" ");
		}
		

	}

}
