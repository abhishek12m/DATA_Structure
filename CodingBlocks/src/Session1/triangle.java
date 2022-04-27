package Session1;

import java.util.ArrayList;
import java.util.List;

public class triangle {
	private static int sol(List<ArrayList<Integer>> cost,int cr,int cc) {
		if(cr==cost.size()-1) {
			return cost.get(cr).get(cc);
		}
		int c1=sol(cost,cr+1,cc);
		int c2=sol(cost,cr+1,cc+1);
		return Math.min(c1, c2)+cost.get(cr).get(cc);
	}

	public static void main(String[] args) {
        //List<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>((2),(3,4),(6,5,7),(4,1,8,3));
       // System.out.print(sol(cost,0,0));
	}

}
