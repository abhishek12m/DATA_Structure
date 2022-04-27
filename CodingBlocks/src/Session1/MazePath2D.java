package Session1;

public class MazePath2D {
	public static void mazePath2D(int cr,int cc,int dr,int dc, String path) {
		if (cr>dr || cc>dc) {
			return;
		}
		if (cr==dr && cc==dc) {
			System.out.println(path);
			return;
		}
		mazePath2D(cr,cc+1,dr,dc,path+"H");
		mazePath2D(cr+1,cc,dr,dc,path+"V");
	}

	public static void main(String[] args) {
		int m=3;
		int n=3;
		mazePath2D(0,0,m-1,n-1,"");
	}

}
