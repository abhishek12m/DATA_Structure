package Session1;

import java.util.Stack;

public class validSubarray {

	public static void main(String[] args) {
		int[] ht= {3,2,1};
		int[] nse=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]>ht[cur]) {
				nse[vis.pop()]=cur;
			}
			vis.push(cur);
		}
		while(!vis.isEmpty()) {
			nse[vis.pop()]=ht.length;
		}
		int count=0;
		for(int i=0;i<nse.length;i++) {
			int s=i;
			int e=nse[i];
			count+=(e-s);
		}
		System.out.println(count);
	}

}
