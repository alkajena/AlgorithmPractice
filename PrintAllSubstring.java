package Algorithms;

public class PrintAllSubstring {

	public static void main(String[] args) {
		String str="ABCD";
		int n=str.length();
		for(int len=1;len<=n;len++){
			for(int i=0;i<=(n-len);i++){
				int j=i+len-1;
				for(int k=i;k<=j;k++){
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}

	}

}
