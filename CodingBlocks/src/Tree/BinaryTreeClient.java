package Tree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 20 -1 40 -1 -1 50 60 -1 -1 -1
		//3 9 20 -1 -1 15 7
		//1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
		BinaryTree bt=new BinaryTree();
//		bt.preOrder();
//		System.out.println();
//		bt.inOrder();
//		System.out.println();
//		bt.postOrder();
//		System.out.println();
//		System.out.print(bt.find(10));
		bt.Level_Order();
		//bt.Level_Order_Line_Wise();
	}

}
