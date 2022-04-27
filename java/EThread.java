package java;

public class EThread extends Thread {
	public void fun() {
		try {
			for (int i=0;i<5;i++) {
				System.out.print("a");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i) {
			
		}
	}
}
class b{

	public static void main(String[] args) throws InterruptedException{
		EThread t=new EThread();
		t.fun();
		for (int i=0;i<5;i++) {
			System.out.print("b");
			Thread.sleep(1000);
		}

	}

}
