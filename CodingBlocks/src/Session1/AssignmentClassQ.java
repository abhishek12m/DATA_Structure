package Session1;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentClassQ {
	private static void sol(int n,ArrayList<String> list) {
		if(n==1) {
			list.add("a");
			list.add("b");
			return;
		}
		sol(n-1,list);
		String a="a";
	    String b="b";
	    ArrayList<String> newlist=new ArrayList<>();
	    for (int i=0;i<list.size();i++) {
	    	String x=list.get(i);
	    	newlist.add(a+x);
	    }
	    for (int i=0;i<list.size();i++) {
	    	String x=list.get(i);
	    	if(x.charAt(0)!='b') {
	    		newlist.add(b+x);
	    	}
	    }
	    list.clear();
	    for(int i=0;i<newlist.size();i++) {
	    	list.add(newlist.get(i));
	    }
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=1;i<=t;i++) {
			int n=sc.nextInt();
			ArrayList<String> list=new ArrayList<>();
			sol(n,list);
			System.out.println("#"+i +" : "+list.size() + list);
		}

	}

}
