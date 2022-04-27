package Session1;

import java.util.Stack;

public class NSE {

	public static void main(String[] args) {
		int[] ht= {80,70,60,75,10};
		int[] nse=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]>ht[cur]) {
				nse[vis.pop()]=ht[cur];
			}
			vis.push(cur);
		}
		while(!vis.isEmpty()) {
			nse[vis.pop()]=-1;
		}
		for(int i=0;i<nse.length;i++) {
			System.out.println("nse of " +ht[i]+" is "+nse[i]);
		}

	}

}
