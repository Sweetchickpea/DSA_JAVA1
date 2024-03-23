package demo;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,6,8,9};
		int smallest= Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println(smallest);

	}

}
