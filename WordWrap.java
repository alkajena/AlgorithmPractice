package Algorithms;

public class WordWrap {

	public static void main(String[] args) {
		int[] arr={5,3,2,2};
		int k=6;
		int n=arr.length;
		wordWrap(arr,n,k);

	}
	public static void wordWrap(int[] arr,int n,int k){
		int i,j,cost;
		int[] dp=new int[n];
		int[] ans=new int[n];
	
		dp[n-1]=0;
		ans[n-1]=n-1;
		
		for(i=n-2;i>=0;i--){
			int currentLine=-1;
			dp[i]=Integer.MAX_VALUE;
			for(j=i;j<n;j++){
				currentLine+=(arr[j]+1);
				if(currentLine > k)
					break;
				if(j==n-1)
					cost=0;
				else
					cost=(currentLine-k)*(currentLine-k)+dp[j+1];
				
				if(cost < dp[i]){
					dp[i]=cost;
					ans[i]=j;
				}
			}
		}
		
		int k1=0;
		while(k1 < n){
			System.out.println((k1+1)+" "+(ans[k1]+1)+" ");
			k1=ans[k1]+1;
		}
		
	}
}
