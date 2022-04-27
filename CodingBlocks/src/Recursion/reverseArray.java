package Recursion;

import java.util.Scanner;

public class reverseArray {
	private static void reverse(int [] ar,int n) {
		if(n==0) {
			return;
		}
		System.out.print(ar[n-1]+" ");
		reverse(ar,n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar= new int[n];
		for (int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		reverse(ar,n);
	}
}
