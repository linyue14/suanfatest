package stack;

public class Stack {

	public static void main(String[] args) {
		String s="abaaba";
		String s1="";
		String s2="";
		int len = s.length();
		int mid=len/2;
		int next=0;	
		for(int i=0;i<mid;i++){
			s1+=s.charAt(i);
		}
		if(len%2==0){
			next=mid;
		}
		if(len%2!=0){
			next=mid+1;
		}
		for(int i=next;i<s.length();i++){
			s2+=s.charAt(i);
		}
		if(s2.contains(s1)){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
