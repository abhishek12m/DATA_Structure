package Recursion;

import java.util.ArrayList;

public class generateParenthesis {
	private static void GenerateParenthesis(int n,int op,int cl,String ans,ArrayList<String> list) {
		if(op==n && cl==n) {
			list.add(ans);
			return;
		}
		if(op<n) {
			GenerateParenthesis(n,op+1,cl,ans+"(",list);
		}
		if(cl<op) {
			GenerateParenthesis(n,op,cl+1,ans+")",list);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		GenerateParenthesis(3,0,0,"",list);
		System.out.print(list);
		
	}

}
