package Algorithms;

public class SubstringFirsthalfSecondhalfSame {

	public static void main(String[] args) {
		String s="1538023";
		printSubstring(s, s.length());

	}
	public static void printSubstring(String s,int n){
		int maxLength=0;
		String finalStr="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j+=2){
				int length=j-i+1;
				int lSum=0;int rSum=0;
				String str="";
				for(int k=0;k<(length/2);k++){
					lSum+=s.charAt(k+i)-'0';
					str=str+s.charAt(k+i);
					rSum+=s.charAt(k+i+(length/2))-'0';
					str=str+s.charAt(k+i+(length/2));
				}
				if(lSum==rSum && maxLength < length){
					maxLength=length;
					finalStr=str;
				}
			}
		}
		System.out.println("The substring is : "+finalStr+" having length of : "+maxLength);
	}
}
