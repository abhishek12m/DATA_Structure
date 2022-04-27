package Session1;

import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		int[] ht= {11,13,21,3};
		int[] nge=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]<ht[cur]) {
				nge[vis.pop()]=ht[cur];
			}
			vis.push(cur);
		}
		while(!vis.isEmpty()) {
			nge[vis.pop()]=-1;
		}
		for(int i=0;i<nge.length;i++) {
			System.out.println("nge of " +ht[i]+" is "+nge[i]);
		}
	}

}
