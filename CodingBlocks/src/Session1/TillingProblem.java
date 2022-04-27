package Session1;

public class TillingProblem {
	private static int sol(int n,int[] cache) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(cache[n]!=-1) {
			return cache[n];
		}
		int v=sol(n-1,cache);
		int h=sol(n-2,cache);
		return cache[n]=h+v;
	}
	public static void main(String[] args) {
		int n=7;
		int [] cache=new int[n+1];
		for (int i=0;i<n+1;i++) {
			cache[i]=-1;
		}
		System.out.print(sol(n,cache));
	}
}
//package Session1;
//
//public class TillingProblem {
//	private static int sol(int n) {
//		if(n==0) {
//			return 1;
//		}
//		if(n<0) {
//			return 0;
//		}
//		int v=sol(n-1);
//		int h=sol(n-2);
//		return h+v;
//	}
//	public static void main(String[] args) {
//		int n=7;
//		System.out.print(sol(n));
//	}
//}
