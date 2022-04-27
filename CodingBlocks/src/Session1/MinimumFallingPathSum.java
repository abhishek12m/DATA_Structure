package Session1;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumFallingPathSum {
	private static int sol(int cr,int cc,int dr,int dc,int[][] cost,int[][] cache) {
		if(cc>dc || cc<0) {
			return Integer.MAX_VALUE;
		}
		if(cr==dr) {
			return cost[cr][cc];
		}
        if(cache[cr][cc]!=-1){
            return cache[cr][cc];
        }
		int c1=sol(cr+1,cc-1,dr,dc,cost,cache);
		int c2=sol(cr+1,cc,dr,dc,cost,cache);
		int c3=sol(cr+1,cc+1,dr,dc,cost,cache);
		return cache[cr][cc]=Math.min(c1, Math.min(c2, c3))+cost[cr][cc];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [][] matrix=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
//		int [][] matrix={{2,1,3},{6,5,4},{7,8,9}};
		int [][] cache =new int[matrix.length+1][matrix.length+1];
        for(int [] arr : cache){
            Arrays.fill(arr,-1);
        }
        
        int miNAns=Integer.MAX_VALUE;
        for (int cc=0;cc<matrix.length;cc++){
            miNAns=Math.min(miNAns,sol(0,cc,matrix.length-1,matrix.length-1,matrix,cache));
        }
        System.out.print(miNAns);

	}

}
