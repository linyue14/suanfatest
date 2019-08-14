package greedy;

import java.util.Arrays;

public class FindContentChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g={1,2,3,4,5};
		int[] s={2,4,6,2,1};
		System.out.println(findContentChildren(g, s));
	}
	
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
	    Arrays.sort(s);
	    int i=0,j=0;
	    while(i<g.length&&j<s.length){
	    	if(g[i]<=s[j])i++;
	    	j++;
	    }
	    return i;
    }

}
