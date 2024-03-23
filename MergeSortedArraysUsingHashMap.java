package demo;

import java.util.HashMap;
import java.util.Map;

public class MergeSortedArraysUsingHashMap {
	
	public static void mergedArrays(int[] a,int[] b,int n1,int n2) {
		HashMap<Integer,Boolean> hm= new HashMap<>();
		
		for(int i=0;i<n1;i++) {
			hm.put(a[i], true);
		}
		for(int i=0;i<n2;i++) {
			hm.put(b[i], true);
		}
		for(Map.Entry<Integer, Boolean>me:hm.entrySet()) {
			System.out.print
			(me.getKey()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2,3,4,4};
		int[] b= {1,2,3,3,4,5};
		
		int n1= a.length;
		int n2= b.length;
		mergedArrays(a,b,n1,n2);

	}

}
