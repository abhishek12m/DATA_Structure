package SSL;

public class LinkedList1 {
	private class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	private void display1() {
		Node i=head;
		while(i!=null) {
			System.out.print(i.data+"->");
			i=i.next;
		}
		System.out.print("null");
	}
	
	private void addLast1(int val) {
		size++;
		Node node=new Node(val);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
//		if(head==null) {
//			head=node;
//			return;
//		}
//		Node i=head;
//		while(i.next!=null) {
//			i=i.next;
//		}
//		i.next=node;
		tail.next=node;
		tail=node;
		
	}
	private void addFirst1(int val) {
		size++;
		Node node=new Node(val);
		
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		node.next=head;
		head=node;
	}
	private void adAtIdx1(int idx,int val) throws Exception {
		if(idx==0 || head==null) {
			addFirst1(val);
			return;
		}
		if(idx==this.size1()) {
			addLast1(val);
			return;
		}
		Node idx_1=getNode1(idx-1);
		Node idx_2=idx_1.next;
		Node nn=new Node(val);
		idx_1.next=nn;
		nn.next=idx_2;
		size++;
	}
	private int getValu1(int idx) throws Exception {
		return getNode1(idx).data; //node.data;
		
	}
	private Node getNode1(int idx) throws Exception{
		if(this.isEmpty1()) {
			throw new Exception("LinkedList khali hai! ");
		}
		if(idx<0 || idx>this.size1()-1) {
			throw new Exception("Galat index ");
		}
		Node temp=head;
		for (int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp;
		
	}
	private int size1() {
//		if(head==null) {
//			return 0;
//		}
//		Node temp=head;
//		int c=1;
//		while(temp!=null) {
//			temp=temp.next;
//			c++;
//		}
//		return c;
		return size;
		
	}
	private boolean isEmpty1() {
		return size==0;
	}

	public static void main(String[] args) throws Exception {
		LinkedList ll=new LinkedList();
//		ll.addLast1(0);
//		ll.addLast1(98);
//		ll.addLast1(67);
//		ll.addLast1(789);
//		ll.addFirst1(2);
//		ll.addFirst1(4);
//		ll.getNode1(2);
//		ll.adAtIdx1(ll.size1(), 1);
//		ll.display1();
		System.out.println();
//		System.out.print(ll.getValu(4));
		//System.out.print(ll.size());
	}

}
