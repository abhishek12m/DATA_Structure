package Recursion;

public class reverseS {

	private static void string(String s) {
		if(s.length()==0) {
			return;
		}
		String subS=s.substring(1);
		string(subS);
		char firstC=s.charAt(0);
		System.out.print(firstC);
	}

	public static void main(String[] args) {
		string("JAVA");
	}

}
