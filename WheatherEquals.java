package demo;

import java.util.HashMap;
import java.util.Map;

public class WheatherEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,3,4,5};
		int[] b= {1,1,2,3,5,4};
		
		int flag=0;
		if(a.length!=b.length) {
			flag=1;
		}
		else {
			Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
			
			for(int x:a) {
				if(mp.get(x)==null) {
					mp.put(x, 1);
				}
				else {
					int count= mp.get(x);
					count++;
					mp.put(x, count);
				}
			}
			for(int x:b) {
				if(!mp.containsKey(x)||mp.get(x)==0) {
					flag=1;
					break;
				}
				else {
					int count= mp.get(x);
					count--;
					mp.put(x, count);
				}
			}
		}
		if(flag==0) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}

	}

}
