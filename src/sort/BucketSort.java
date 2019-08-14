package sort;


public class BucketSort {

	public static void main(String[] args) {
		int[] arr={1,8,5,5,7,5,3,7,10};
		int[] arr1=new int[11];		
		bucketSort(arr, arr1);		
	}
	public static void bucketSort(int[] arr,int[] arr1){
		for(int i=0;i<arr1.length;i++){
			arr1[i]=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==i){
					arr1[i]+=1;
				}
			}
		}
		for(int z=0;z<arr1.length;z++){
			for(int y=0;y<arr1[z];y++){
				 System.out.println(z);
			 } 
		}	
	}

}
