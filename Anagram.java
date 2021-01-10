package Algorithms;

public class Anagram {
	public static int max=256;
	public static void main(String[] args) {
		String txt="ACBDEFGBCDAABCDYTRGDCAB";
		String pat="ABCD";
		int m=pat.length();
		int n=txt.length();
		findAnagrams(txt,pat,m,n);
	}

	public static void findAnagrams(String txt, String pat, int m, int n) {
		
		char[] countP=new char[max];
		char[] countTx=new char[max];
		
		for(int i=0;i<m;i++){
			countP[pat.charAt(i)]++;
			countTx[txt.charAt(i)]++;
		}
		
		for(int i=m;i<n;i++){
			if(compare(countP,countTx)){
				System.out.println("The index is : "+(i-m));
			}
			countTx[txt.charAt(i)]++;
			countTx[txt.charAt(i-m)]--;
		}
		
		if(compare(countP,countTx)){
			System.out.println("The index is : "+(n-m));
		}
		
	}
	
	public static boolean compare(char[] arr1,char[] arr2){
		for(int i=0;i<max;i++){
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}

}
