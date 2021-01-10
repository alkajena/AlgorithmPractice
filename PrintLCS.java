package Algorithms;

public class PrintLCS {

	public static void main(String[] args) {
		String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB"; 
	  
	    char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	    int m = X.length; 
	    int n = Y.length; 
	    
	    
	    		printLCS( X, Y, m, n ); 

	}
	
	public static void printLCS(char[] arr1,char[] arr2,int m,int n){
		
		int[][] lcs=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0)
					lcs[i][j]=0;
				else if(arr1[i-1]==arr2[j-1])
					lcs[i][j]=1+lcs[i-1][j-1];
				else
					lcs[i][j]=Math.max(lcs[i-1][j], lcs[i][j-1]);
				
			}
		}
		int length=lcs[m][n];
		char[] arr=new char[length+1];
		arr[length]='\0';
		int i=m;int j=n;
		while(i>0 && j>0){
			if(arr1[i-1]==arr2[j-1]){
				arr[length-1]=arr1[i-1];
				i--;
				j--;
				length--;
			}
			else if(lcs[i-1][j] > lcs[i][j-1])
				i--;
			else
				j--;
		}
		System.out.println(arr);
	}

}
