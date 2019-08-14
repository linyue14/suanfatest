package remove;


public class RemoveElement {

	public static void main(String[] args) {
		int[] nums={5,3,5,3,7};
		int len=removeElement(nums, 3);
		for(int i=0;i<len;i++){
			System.out.println(nums[i]);
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		int pos=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[pos]=nums[i];
				pos++;
			}
		}		
		return pos;       
    }
}
