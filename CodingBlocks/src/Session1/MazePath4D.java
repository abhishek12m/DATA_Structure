package Session1;

public class MazePath4D {
	
	public static void mazePath4D(int cr,int cc,int dr,int dc, String path,boolean[][] vis) {
		if (cr>dr || cr<0 || cc<0 || cc>dc || vis[cr][cc] ) {
			return;
		}
		if (cr==dr && cc==dc) {
			System.out.println(path);
			return;
		}
		vis[cr][cc]=true;
		mazePath4D(cr-1,cc,dr,dc,path+"U",vis);
		mazePath4D(cr+1,cc,dr,dc,path+"D",vis);
		mazePath4D(cr,cc-1,dr,dc,path+"L",vis);
		mazePath4D(cr,cc+1,dr,dc,path+"R",vis);
		vis[cr][cc]=false;
		return;
	}

	public static void main(String[] args) {
		int m=3;
		int n=3;
		mazePath4D(0,0,m-1,n-1,"",new boolean[m][n]);
	}
}