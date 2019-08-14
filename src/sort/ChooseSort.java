package sort;

import java.util.Arrays;

public class ChooseSort {

	public static void main(String[] args) {
		int[] arr={1,8,5,5,3,2,7};
		choosesort1(arr);
		for(int j:arr){
			System.out.println(j);
		}
		System.out.println(Arrays.toString(arr));
		

	}
	public static void choosesort1(int[] arr){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}			
			}
		}		
	}

}
