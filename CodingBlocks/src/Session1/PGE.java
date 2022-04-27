package Session1;

import java.util.Stack;

public class PGE {

	public static void main(String[] args) {
		int[] ht= {80,70,60,75};
		int[] pge=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		pge[0]=-1;
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]<=ht[cur]) {
				vis.pop();
			}
			if(!vis.isEmpty()) {
				pge[cur]=ht[vis.peek()];
			}
			else {
				pge[cur]=-1;
			}
			vis.push(cur);
		}
		for(int i=0;i<pge.length;i++) {
			System.out.println("pge of " +ht[i]+" is "+pge[i]);
		}
	}
}
