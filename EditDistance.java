package Algorithms;

public class EditDistance {

	public static void main(String[] args) {
		String s1="SUNDAY";
		String s2="SATURDAY";
		System.out.println("edit disnace is : "+editDistance(s1, s2,s1.length(), s2.length()));

	}
	public static int editDistance(String str1,String str2,int m,int n){
		if(m==0)
			return n;
		if(n==0)
			return m;
		if(str1.charAt(m-1)==str2.charAt(n-1))
			return editDistance(str1, str2, m-1, n-1);
		else
			return 1+(min(editDistance(str1, str2, m-1, n-1), editDistance(str1, str2, m, n-1),
					editDistance(str1, str2, m-1, n)));
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
