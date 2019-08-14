package romanToInt;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="IV";
		System.out.println(romanToInt(s));
		
	}
	
	public static int romanToInt(String s){
		HashMap<Character, Integer>map=new HashMap<>();
		map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
		int sum=0,pre=0;
		for (Character c : s.toCharArray()) {
            int cur=map.get(c);
            sum+=cur>pre?cur-2*pre:cur;
            pre=cur;
        }	
		return sum;		
	}

}
