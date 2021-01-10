package Algorithms;

public class MinJumpsToReachEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
        System.out.print("Minimum number of jumps to reach end is "
                         + minJumps(arr, 0, n - 1));

	}
	public static int minJumps(int[] arr,int l,int h){
		int min=Integer.MAX_VALUE;
		if(arr[l]==0)
			return Integer.MAX_VALUE;
		if(l==h)
			return 0;
		for(int i=l+1;i<=h && i<=(l+arr[l]);i++){
			int jump=minJumps(arr,i,h);
			if(jump!=Integer.MAX_VALUE && (1+jump) < min){
				min=1+jump;
			}
		}
		return min;
	}
}
