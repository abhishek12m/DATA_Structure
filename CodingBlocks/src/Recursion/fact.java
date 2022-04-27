package Recursion;

public class fact {
	private static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);
		return fn*n;
	}
	public static void main(String[] args) {
		System.out.print(fact(5));
	}
}
