package demo;

public class BiggestEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,6,8,9};
		int biggest= Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>biggest) {
				biggest=a[i];
			}
			
		}
		System.out.println(biggest);

	}

}
