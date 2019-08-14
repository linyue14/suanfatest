package greedy;

public class Shares {

	public static void main(String[] args) {
		int[] prices={3,4,2,8};
		System.out.println(pricess(prices));

	}
	//贪心算法求股票最大收益
	public static int pricess(int[] prices){
		int profit=0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1]){
				profit+=prices[i]-prices[i-1];
			}else{
				profit-=prices[i-1]-prices[i];
			}
		}
		return profit;		
	}

}
