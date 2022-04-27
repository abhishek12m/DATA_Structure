package Session1;

import java.util.Arrays;

public class Span {

	public static void main(String[] args) {
		int ht[]= {1,7,4,2,3,6};
		int [] span=new int[ht.length];
		Arrays.fill(span,1);
		for (int i=1;i<ht.length;i++) {
			for (int prev=i-1;prev>=0;prev--) {
				if(ht[prev]<=ht[i]) {
					span[i]++;
				}
				else {
					break;
				}
			}
		}
		System.out.print(Arrays.toString(span));
//		0(n*n)
//		int ht[]= {1,7,4,2,3,6};
//		int [] span=new int[ht.length];
//		Arrays.fill(span,1);
//		for (int i=1;i<ht.length;i++) {
//			for (int prev=i-1;prev>=0;prev--) {
//				if(ht[prev]<=ht[i]) {
//					span[i]++;
//				}
//				else {
//					break;
//				}
//			}
//		}
//		System.out.print(Arrays.toString(span));
	}

}
