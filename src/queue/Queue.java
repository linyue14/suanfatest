package queue;


public class Queue {

	public static void main(String[] args) {
		int[] qq={6,3,1,7,5,8,9,2,4};		
		Queue1(qq);
		System.out.println();
		System.out.println("615947283");
	}
	public static void Queue1(int[] arr){		
		int[] queue=new int[64];
		for(int i=0;i<arr.length;i++){
			queue[i]=arr[i];
		}
		int head=0;
		int tail=9;
		while(head<tail){
			System.out.print(queue[head]);
			head++;
			queue[tail]=queue[head];
			tail++;
			head++;
			
		}				
	}

}
