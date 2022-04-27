package Session1;

import java.util.Arrays;
import java.util.Stack;

public class SpanStack {

	public static void main(String[] args) {
		int[] ht= {30,35,40,38,35};
		int[] span=new int[ht.length];
		span[0]=1;
		Stack<Integer> vis=new Stack<>();
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]<=ht[cur]) {
				vis.pop();
			}
			span[cur]=vis.isEmpty()?cur+1: cur-vis.peek();
			vis.push(cur);
		}
		System.out.print(Arrays.toString(span));

	}

}
