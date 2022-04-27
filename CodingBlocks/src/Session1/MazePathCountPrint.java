package Session1;

import java.util.Scanner;

public class MazePathCountPrint {
	private static int sol(int cr,int cc,int dr,int dc,String path) {
		if(cc>dc || cr>dr) {
			return 0;
		}
		if(cc==dc && cr==dr) {
			System.out.print(path +" ");
			return 1;
		}
		int h=0,v=0;
		h=sol(cr,cc+1,dr,dc,path+"H");
		v=sol(cr+1,cc,dr,dc,path+"V");
		return h+v;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int ways=sol(0,0,n-1,m-1,"");
		System.out.print("\n"+ways);
	}
}
