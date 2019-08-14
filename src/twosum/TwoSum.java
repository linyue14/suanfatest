package twosum;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {	
		int nums[]={2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums,18)));
	}
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length-1;i++){
			for(int j=nums.length-1;j>i;j--){
				if(nums[i]+nums[j]==target){
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }

}
