package Algorithms;

public class ConsecutiveSequence {

	public static void main(String[] args) {
		char mat[][] = { {'a','c','d'}, 
                { 'h','b','e'}, 
                { 'i','g','f'}}; 
		int r=3;
		int c=3;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(mat[i][j]=='e')
					System.out.println(countSequence(mat,i,j,r,c));
			}
		}

		

	}
	public static String countSequence(char[][] arr,int i,int j,int r,int c){
		if(i<0 && j<0 && i>=r && j>=c){
			return null;
		}		
		String path=null;
		if((i-1)>=0 && (arr[i-1][j]-arr[i][j])==1)
			path=countSequence(arr, i-1, j, r, c);
		if((j-1)>=0 && (arr[i][j-1]-arr[i][j])==1)
			path=countSequence(arr, i, j-1, r, c);
		if((i+1)<r && (arr[i+1][j]-arr[i][j])==1)
			path=countSequence(arr, i+1, j, r, c);
		if((j+1)<c && (arr[i][j+1]-arr[i][j])==1)
			path=countSequence(arr, i, j+1, r, c);
		if(i>0 && j>0 && (arr[i-1][j-1]-arr[i][j])==1)
			path=countSequence(arr, i-1, j-1, r, c);
		
		return path!=null?arr[i][j]+"-"+path:arr[i][j]+"";
	}
}
