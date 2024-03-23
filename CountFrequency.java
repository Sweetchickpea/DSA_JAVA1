package demo;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

	
		
		public static void countFreq(int[] a,int n) {
			Map<Integer,Integer> hm= new HashMap<>();
			
			for(int i=0;i<n;i++) {
				if(hm.containsKey(a[i])) {
					hm.put(a[i], hm.get(a[i])+1);
				}else {
					hm.put(a[i],1);
				}
			}
			for(Map.Entry<Integer, Integer>me:hm.entrySet()) {
				System.out.println(me.getKey()+" "+me.getValue());
			}
		

	}public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,7,8,1,4,9,8};
		int n= a.length;
		countFreq(a,n);

}}
