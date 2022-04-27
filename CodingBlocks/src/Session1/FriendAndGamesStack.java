package Session1;

import java.util.Stack;

public class FriendAndGamesStack {

	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();
		String st="25426251";
		int n=st.length();
		for (int i=0;i<n+1;i++) {
			stack.push(i+1);
			if(i==n || st.charAt(i)%2==0) {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}
		}
//		Stack <Integer> stack = new Stack<Integer>();
//		String st="DID";
//		int n=st.length();
//		for (int i=0;i<n+1;i++) {
//			stack.push(i+1);
//			if(i==n || st.charAt(i)=='I') {
//				while(!stack.isEmpty()) {
//					System.out.print(stack.pop());
//				}
//			}
//		}

	}

}
