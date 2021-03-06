package Algorithms;

public class MinimumNoOfSquares {

	public static void main(String[] args) {
		int n=100;
		
		System.out.println("The square is : "+square(n));

	}
	
	public static int square(int n){
		int res=n;
		if(n<=3)
			return n;
		for(int i=2;i<=n;i++){
			int k=i*i;
			if(k > n)
				break;
			res= Math.min(res, 1+square(n-k));
		}
		return res;
	}

}
