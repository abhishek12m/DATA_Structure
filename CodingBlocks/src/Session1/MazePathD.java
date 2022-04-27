package Session1;

import java.util.Scanner;

public class MazePathD {
	private static int sol(int cr,int cc,int dr,int dc,String path) {
		if(cc>dc || cr>dr) {
			return 0;
		}
		if(cc==dc && cr==dr) {
			System.out.print(path +" ");
			return 1;
		}
		int h=0,v=0,d=0;
		v=sol(cr+1,cc,dr,dc,path+"V");
		h=sol(cr,cc+1,dr,dc,path+"H");
		if(cc==cr || cc+cr==dr){
			d=sol(cr+1,cc+1,dr,dc,path+"D");
		}
		return h+v+d;
	}
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		int n=var.nextInt();
		int m=var.nextInt();
		int ways=sol(0,0,m-1,n-1,"");
		System.out.print("\n"+ways);
	}
}
