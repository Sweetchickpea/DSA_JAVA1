package demo;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,20,30};
		int a1= a.length;
		int[] b= {50,60,70};
		int b1= b.length;
		int c1= a1+b1;
		
		int[] c= new int[c1];
		
		for(int i=0;i<a1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b1;i++) {
			c[a1+i]=b[i];
		}
		for(int i=0;i<c1;i++) {
			System.out.print(c[i]+" ");
		}
		

	}

}
