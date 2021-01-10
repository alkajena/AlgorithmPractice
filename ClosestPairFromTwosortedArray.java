package Algorithms;

public class ClosestPairFromTwosortedArray {

	public static void main(String[] args) {
		int[] arr1={1, 4, 5, 7};
		int[] arr2={10, 20, 30, 40};
		int x=32;
		
		int l=0;
		int h=arr2.length-1;
		int m=arr1.length;
		int diff=Integer.MAX_VALUE;
		int rRes = 0;
		int lRes = 0;
		
		int i=l;
		int j=h;
		
		while(j>=0 && i<m){
			if(Math.abs((arr1[i]+arr2[j])-x) <  diff){
				diff=Math.abs((arr1[i]+arr2[j])-x);
				rRes=j;
				lRes=i;
			}
			
			if((arr1[i]+arr2[j]) > x){
				j--;
			}
			else{
				i++;
			}
		}
		System.out.println("The numbers are : "+arr1[lRes]+" "+arr2[rRes]);		

	}

}
