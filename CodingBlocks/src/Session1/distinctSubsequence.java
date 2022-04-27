package Session1;

import java.util.Arrays;

public class distinctSubsequence {
	private static int sol(String s,String t,int curs,int curt,int[][] cache) {
		if(curt==t.length()) {
			return 1;
		}
		if(curs==s.length()) {
			return 0;
		}
		if(cache [curs][curt]!=-1) {
			return cache [curs][curt];
		}
		int p=0,r=0;
		if(s.charAt(curs)==t.charAt(curt)) {
			p=sol(s,t,curs+1,curt+1,cache);
		}
		r=sol(s,t,curs+1,curt,cache);
		return cache [curs][curt]=p+r;
	}

	public static void main(String[] args) {
		String s="rabbbit";
		String t="rabbit";
		int [][] cache=new int[s.length()+1][t.length()+1];
		for (int [] arr : cache) {
			Arrays.fill(arr, -1);
		}
		System.out.print(sol(s,t,0,0,cache));
	}

}
