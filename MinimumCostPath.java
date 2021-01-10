package Algorithms;

public class MinimumCostPath {

	public static void main(String[] args) {
		 int cost[][] = { {1, 2, 3}, 
                 {4, 8, 2}, 
                 {1, 5, 3} }; 
                   
System.out.print(minCostPath(cost, 2, 2));

	}
	public static int minCostPath(int[][] cost,int m,int n){
		if(m<0 || n<0)
			return Integer.MAX_VALUE;
		if(m==0 && n==0)
			return cost[m][n];
		else
			return cost[m][n]+min(minCostPath(cost,m-1,n-1),minCostPath(cost,m,n-1),minCostPath(cost,m-1,n));
	}
	public static int min(int a,int b,int c){
		if(a < b){
			if(a < c)
				return a;
			else
				return c;
				
		}
		else{
			if(b < c)
				return b;
			else
				return c;
		}
	}
}
