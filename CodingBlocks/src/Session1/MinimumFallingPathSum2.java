package Session1;

import java.util.Arrays;

public class MinimumFallingPathSum2 {
	private static int sol(int cr,int cc, int[][] grid,int [][] cache) {
		if(cr==grid.length-1) {
			return grid[cr][cc];
		}
		if (cache[cr][cc]!=-1) {
			return cache[cr][cc];
		}
		int ans=Integer.MAX_VALUE;
		for (int i=0;i<grid.length;i++) {
			if(cc!=i) {
				ans=Math.min(ans,sol(cr+1,i,grid,cache));
			}
		}
		return cache[cr][cc]=ans+grid[cr][cc];
	}

	public static void main(String[] args) {
		int[][] grid= {{-2,-18,31,-10,-71,82,47,56,-14,42},{-95,3,65,-7,64,75,-51,97,-66,-28},{36,3,-62,38,15,51,-58,-90,-23,-63},{58,-26,-42,-66,21,99,-94,-95,-90,89},{83,-66,-42,-45,43,85,51,-86,65,-39},{56,9,9,95,-56,-77,-2,20,78,17},{78,-13,-55,55,-7,43,-98,-89,38,90},{32,44,-47,81,-1,-55,-5,16,-81,17},{-87,82,2,86,-88,-58,-91,-79,44,-9},{-96,-14,-52,-8,12,38,84,77,-51,52}};
		int [][] cache=new int[grid.length+1][grid.length+1];
		for (int arr[] : cache) {
			Arrays.fill(arr,-1);
		}
		int minAns=Integer.MAX_VALUE;
		for (int cc=0;cc<grid.length;cc++) {
			minAns=Math.min(minAns,sol(0,cc,grid,cache));
		}
		System.out.print(minAns);

	}

}
