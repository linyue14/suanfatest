package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args){
        Integer[] arr = {5,2,7,3,9,10,8,6,1,4,7,6,3};
        sortQuick(arr,0,arr.length-1);
        
       //数组去重
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
        int key = arr[left]; //选定数组第一个数字作为key
        int start = left,end = right;
        while(start<end){
            //从右向左遍历,找到小于key的,放入下标strat中。
            while(start < end && arr[end] >= key){end--;}
            arr[start] = arr[end];
            //从左向右遍历,找到大于key的,放入下标end中。
            while(start < end && arr[start] <= key){start++;}
            arr[end] = arr[start];
        }
        //此时start==end,这就是所谓的轴，把key放入轴中，轴左边的都<key,轴右边的都>key
        arr[start] = key;
        //此时大家想象一下，轴在数组中间，说明把数组分成两部分，此时要对这两部分分别进行快排。
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
