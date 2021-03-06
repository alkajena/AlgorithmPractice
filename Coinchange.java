package Algorithms;

public class Coinchange {

	public static void main(String[] args) {
		int[] arr={1,2,3};
		int m=arr.length;
		int n=4;
		System.out.println("The number of ways to get 4 from above array : "+coinChange(arr,m,n));

	}

	private static int coinChange(int[] arr, int m, int n) {
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(m<=0 && n>0)
			return 0;
		return (coinChange(arr,m-1,n)+coinChange(arr,m,n-arr[m-1]));
	}

}
