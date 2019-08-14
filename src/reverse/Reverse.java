package reverse;


public class Reverse {

	public static void main(String[] args) {
		int x=1534236469;
		System.out.println((reverse(x)));

	}
	
	public static int reverse(int x) {
	        long m = 0;  
	        while(x!=0){  
	            m = m*10 + x % 10;   
			    if(m > Integer.MAX_VALUE) return 0;
			    if(m < Integer.MIN_VALUE) return 0;
	            x = x / 10;  
	        }       	        
	        return (int) m;	        

	}

}
