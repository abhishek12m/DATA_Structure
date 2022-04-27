package SSL;

import java.util.Scanner;

public class numberinfy {

	public static void main(String[] args) {
		int n=7;
		int[] arr= {2,4,7,8,9,8,10};
		for (int i=0;i<n;i++){
            if(i==n-1){
                System.out.print(arr[i]+" ");
                return;
            }
            System.out.print(arr[i+1]+" ");
            System.out.print(arr[i]+" ");
            i++;
            
        }
	}

}
