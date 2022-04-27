package Recursion;

public class Print_Dec {

	private static void fact(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		fact(n-1);
	}
	public static void main(String[] args) {
		fact(5);
	}
}
