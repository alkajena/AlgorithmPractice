package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class DistinctPalidromeString {

	public static void main(String[] args) {
		String st="aorgeeksskeegfor";
		distinctPalindromeString(st,st.length());
		System.out.print((st.charAt(0)+1));
		
	}
	public static void distinctPalindromeString(String str,int n){
		int[][] sp=new int[n+1][n+1];
		Map<String,Boolean> map=new HashMap<>();
		
		for(int i=0;i<n;i++){
			sp[i][i]=1;
			map.put(str.substring(i,i+1), true);
		}
		
		for(int i=0;i<n-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				sp[i][i+1]=1;
				map.put(str.substring(i,i+2), true);
			}
			else{
				sp[i][i+1]=0;
			}
		}
		
		for(int len=3;len<n;len++){
			for(int st=0;st<n-len;st++){
				int end=st+len-1;
				if(str.charAt(end)==str.charAt(st) && sp[st+1][end-1]==1){
					sp[st][end]=1;
					map.put(str.substring(st,end+1), true);
				}
			}
		}
		
		for(Map.Entry map1:map.entrySet()){
			System.out.println(map1.getKey());
		}
	}
}
