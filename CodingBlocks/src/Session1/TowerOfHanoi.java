package Session1;

public class TowerOfHanoi {
	private static void toh(int n,char src,char helper,char dest) {
		if (n==1) {
			System.out.println("move "+ n + "th disk from " + src + " to "+dest);
			return;
		}
		toh(n-1,src,dest,helper);
		System.out.println("move "+ n + "th disk from " + src + " to "+dest);
		toh(n-1,helper,src,dest);
	}

	public static void main(String[] args) {
		toh(3,'A','B','C');
	}

}
