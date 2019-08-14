package greedy;

public class Flowers {

	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,0,1};
		System.out.println(canPlaceFlowers(flowerbed, 1));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	   int ctn=0;
	   for(int i=0;i<flowerbed.length;i++){
		   if(flowerbed[i]==1){
			   continue;
		   }
		   int pre=i==0?0:flowerbed[i-1];
		   int next=i==flowerbed.length-1?0:flowerbed[i+1];
		   if(pre==0&&next==0){
			   ctn++;
			   flowerbed[i]=1;
		   }
	   }
	   System.out.println("还能种"+ctn+"朵花");
	   return ctn>=n;
	}
}
