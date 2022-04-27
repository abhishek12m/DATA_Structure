package Session1;

import java.util.Arrays;
import java.util.Stack;

public class Histogram {
	private static int largestRanctangleArea(int[] ht) {
		int[] pse=new int[ht.length];
		Stack<Integer> vis=new Stack<>();
		pse[0]=-1;
		vis.push(0);
		for(int cur=1;cur<ht.length;cur++) {
			while(!vis.isEmpty() && ht[vis.peek()]>=ht[cur]) {
				vis.pop();
			}
			if(!vis.isEmpty()) {
				pse[cur]=vis.peek();
			}
			else {
				pse[cur]=-1;
			}
			vis.push(cur);
		}
		System.out.println(Arrays.toString(pse));
		int[] nse=new int[ht.length];
		vis=new Stack<>();
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
		int maxArea=Integer.MIN_VALUE;
		System.out.println(Arrays.toString(nse));
		for (int cur=0;cur<ht.length;cur++) {
			int width=nse[cur]-pse[cur]-1;
			int area=width*ht[cur];
			maxArea=Math.max(maxArea, area);
		}
		return maxArea;
	}
	public static void main(String[] args) {
		int[] ht= {2,1,5,6,2,3};
		System.out.print(largestRanctangleArea(ht));
	}
}
