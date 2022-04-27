package Session1;

import java.util.Scanner;

public class MoveAllX {
	private static void sol(String s,int i,int l) {
		if(l==0) {
			System.out.print(s);
			return;
		}
//		if(i==l-1) {
//			System.out.print(s);
//			return;
//		}
		l--;
		if(s.charAt(i)=='x') {
			s=s.substring(0,i)+s.substring(i+1)+"x";
		}
		sol(s,i+1,l);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		sol(s,0,l);

	}

}
