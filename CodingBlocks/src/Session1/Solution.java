package Session1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int n=1234;
		
		int[] ar= new int[4];
		int[] ab= new int[4];
		for (int i=0;i<4;i++) {
			int a=n%10;
			n=n/10;
			ar[i]=a;
			ab[i]=a;
		}
		StringBuilder s = new StringBuilder(); 

	    for (int i : ar)
	    {
	         s.append(i); //add all the ints to a string
	    }
	    //s.reverse();
	    int d=Integer.parseInt(s.toString());
	    s.reverse();
	    
	    int m=Integer.parseInt(s.toString());
	    if(c==n) {
	    	System.out.print(1);
	    }
	    n=d-m;
	    c=n;
	    System.out.println(n);
	    
	    
	    
		
	}

}
