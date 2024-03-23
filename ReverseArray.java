package demo;

public class ReverseArray {
	
	public static void reverse(int[] a, int n) {
		for(int i=0;i<n/2;i++) {
			int t= a[i];
			a[i]= a[a.length-1-i];
			a[a.length-1-i]= t;
		}
		System.out.println("rev array is:");
		for(int k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,78,9};
		reverse(a,a.length);
	

	}

}
