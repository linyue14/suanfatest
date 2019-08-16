package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args){
        Integer[] arr = {5,2,7,3,9,10,8,6,1,4,7,6,3};
        sortQuick(arr,0,arr.length-1);
        //去重
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		Integer[] arr1=list.toArray(new Integer[1]);
		System.out.println(Arrays.toString(arr1));
  		
		
        sortQuick1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }    
    
    public static Integer[] sortQuick(Integer[] arr, int left, int right){
        int key = arr[left]; 
        int start = left,end = right;
        while(start<end){
            while(start < end && arr[end] >= key){end--;}
            arr[start] = arr[end];
            while(start < end && arr[start] <= key){start++;}
            arr[end] = arr[start];
        }
        arr[start] = key;
        if(start>left)sortQuick(arr,left,start-1);
        if(end<right)sortQuick(arr, end+1, right);
        return arr;
    }
    
    
    
    
    
    
    public static Integer[] sortQuick1(Integer[] arr, int left, int right){
    	int key=arr[left];
    	int low=left;
    	int high=right;
    	while(low<high){
    		while(low<high && arr[high] <= key){high--;}
    		arr[low]=arr[high];
    		while(low<high && arr[low] >= key){low++;}
    		arr[high]=arr[low];
    	}
    	arr[low]=key;
    	if(low>left)sortQuick1(arr, left, high-1);
    	if(high<right)sortQuick1(arr, low+1, right);
    	return arr;
    } 
    
}
