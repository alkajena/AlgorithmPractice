package Algorithms;

public class NextPalindrome {

	public static void main(String[] args) {
		
		int num=1234;
		
		if(num%2==0){
			System.out.print("the number is even");
			String even=Integer.toString(num);
			int l=0;int h=even.length()-1;
			int m=l+(h-l)/2;
			String firstHalf=even.substring(0, m+1);
			String str=firstHalf+((new StringBuilder(firstHalf)).reverse()).toString();
			int i=Integer.parseInt(str.substring(m, m+1));
			int j=Integer.parseInt(str.substring(m+1, m+2));
			String mid=String.valueOf(i)+String.valueOf(j);
			if(i==9 && j==9){
				
			}
			
			if(Integer.parseInt(str) < num){
				String finalStr=str.substring(0,m)+mid+str.substring(m+2);
				System.out.println(finalStr);
				
			}
			
		}
		else{
			
		}

	}
	
	

}
