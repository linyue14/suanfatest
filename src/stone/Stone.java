package stone;


public class Stone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J="aA";
		String S="aAAbbbbA";
		System.out.println(numJewelsInStones(J, S));
	}
	
	public static int numJewelsInStones(String J, String S) {
//		int sum=0;
//		for(int i=0;i<J.length();i++){
//			char[] c=J.toCharArray();
//			for(int j=0;j<S.length();j++){
//				char[] c1=S.toCharArray();
//				if(c[i]==c1[j]){
//					sum++;
//				}
//			}
//		}
//		return sum;   
		int num = 0;
        for (int i = 0; i < S.length(); i++) {
            String temp = S.substring(i, i + 1);
            if (J.indexOf(temp) != -1) {
                num++;
            }
        }
        return num;
    }

}
