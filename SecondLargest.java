package demo;

public class SecondLargest {
	
	public static int secondLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,98,6,70};
		int total= a.length;
		
		
		System.out.println(secondLargest(a,total));

	}

}
