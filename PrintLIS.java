package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrintLIS {

	public static void main(String[] args) {
		int[] arr = {3, 10, 2, 1, 20};
		int n=arr.length;
		printLIS(arr,n);

	}
	
	public static void printLIS(int[] arr,int n){
		int currentSize=0;
		int finalSize=0;
		List<Integer> currentList=new ArrayList<>();
		List<Integer> finalList=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			currentList=new ArrayList<>();
			currentSize=Integer.MIN_VALUE;
			for(int j=i;j<arr.length;j++){
				if(arr[j] > currentSize){
					currentList.add(arr[j]);
					currentSize=arr[j];
				}
			}
			if( finalSize < currentList.size()){
				finalList=new ArrayList<>(currentList);
				finalSize=currentList.size();
			}
		}
		
		for(int x:finalList){
			System.out.println(x);
		}
	}
}
