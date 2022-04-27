package Recursion;

public class stringPrinter {
	private static void string(String s) {
		if(s.length()==0) {
			return;
		}
		char firstC=s.charAt(0);
		System.out.print(firstC);
		String subS=s.substring(1);
		string(subS);
	}

	public static void main(String[] args) {
		string("NITIN");
	}

}
