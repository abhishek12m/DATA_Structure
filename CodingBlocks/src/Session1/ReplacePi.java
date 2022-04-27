package Session1;

import java.util.Scanner;

public class ReplacePi {
	private static void sol(String s) {
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='p' && s.charAt(i+1)=='i') {
				s=s.substring(0,i)+"3.14"+s.substring(i+2);
			}
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		while(n--!=0) {
			String s = sc.next();
			sol(s);
		}
	}

}
