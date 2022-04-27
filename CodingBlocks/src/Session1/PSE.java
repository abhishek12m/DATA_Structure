package Session1;

import java.util.Stack;

public class PSE {

	public static void main(String[] args) {
		int[] ht= {80,70,60,75};
		int[] pse=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		pse[0]=-1;
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]>=ht[cur]) {
				vis.pop();
			}
			if(!vis.isEmpty()) {
				pse[cur]=ht[vis.peek()];
			}
			else {
				pse[cur]=-1;
			}
			vis.push(cur);
		}
		for(int i=0;i<pse.length;i++) {
			System.out.println("pse of " +ht[i]+" is "+pse[i]);
		}
	}
}
