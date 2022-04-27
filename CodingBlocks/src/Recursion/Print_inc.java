package Recursion;

public class Print_inc {
	private static void fact(int n) {
		if(n==0) {
			return;
		}
		fact(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		fact(5);
	}
}
