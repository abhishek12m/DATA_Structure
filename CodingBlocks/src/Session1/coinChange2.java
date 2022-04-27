package Session1;

import java.util.Arrays;

public class coinChange2 {
	private static int sol(int tarAmount,int[] coins,int cur,int cAmount,int n,int [][] cache) {
		int pick=0,dontPick=0;
		if(cur==n) {
			return 0;
		}
		if(tarAmount==cAmount) {
			return 1;
		}
		if(cache[cAmount][cur]!=-1) {
			return cache[cAmount][cur];
		}
		if(coins[cur]+cAmount<=tarAmount) {
			pick=sol(tarAmount,coins,cur,cAmount+coins[cur],n,cache);
		}
		dontPick=sol(tarAmount,coins,cur+1,cAmount,n,cache);
		return cache [cAmount][cur]=pick+dontPick;
	}

	public static void main(String[] args) {
		int Amount=500;
		int [] coins= {3,5,7,8,9,10,11};
		int n=coins.length;
		int[][] cache=new int[Amount+1][n+1];
		for(int[] arr: cache ) {
			Arrays.fill(arr, -1);
		}
		System.out.print(sol(Amount,coins,0,0,n,cache));

	}

}
