package sort;

import java.util.Arrays;

public class BuddleSort {

	public static void main(String[] args) {
		int[] arr={1,8,5,5,3,9,7};
		buddlesort1(arr);
		for(int j:arr){
			System.out.println(j);
		}
		System.out.println(Arrays.toString(arr));
		

	}
	public static void buddlesort1(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}			
			}
		}		
	}

}