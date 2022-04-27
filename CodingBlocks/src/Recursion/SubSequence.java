package Recursion;

public class SubSequence {
	private static int sol(String ip,String op) {
		int n=0;
		if(ip.length()==0) {
			System.out.print("'"+op+"'");
			n++;
			return 1;
		}
		sol(ip.substring(1),op+ip.charAt(0));
		sol(ip.substring(1),op);
		return n;
		
	}

	public static void main(String[] args) {
		System.out.print(sol("abcd",""));
//		sol("abcd","");

	}

}
