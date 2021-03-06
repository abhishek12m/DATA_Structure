package SSL;

public class LinkedList {
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
	private void display() {
		Node i=head;
		while(i!=null) {
			System.out.print(i.data+"->");
			i=i.next;
		}
		System.out.print("null");
	}
	
	void addLast(int val) {
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
	private void addFirst(int val) {
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
	private void adAtIdx(int idx,int val) throws Exception {
		if(idx==0 || head==null) {
			addFirst(val);
			return;
		}
		if(idx==this.size()) {
			addLast(val);
			return;
		}
		Node idx_1=getNode(idx-1);
		Node idx_2=idx_1.next;
		Node nn=new Node(val);
		idx_1.next=nn;
		nn.next=idx_2;
		size++;
	}
	private int getValu(int idx) throws Exception {
		return getNode(idx).data; //node.data;
		
	}
	private Node getNode(int idx) throws Exception{
		if(this.isEmpty()) {
			throw new Exception("LinkedList khali hai! ");
		}
		if(idx<0 || idx>this.size()-1) {
			throw new Exception("Galat index ");
		}
		Node temp=head;
		for (int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp;
		
	}
	private int size() {
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
	private boolean isEmpty() {
		return size==0;
	}
	private void removeFirst() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("LinkedList khali hai! ");
		}
		if(this.size()==1) {
			head=null;
			tail=null;
			size--;
			return;
		}
//		head=head.next;
		//Actiall removal
//		Node Hnode=head.next;
//		head.next=null;
//		head=Hnode;
		//pointer bhi remove kr diya
		Node tempNode=head;
		head=head.next;
		tempNode=null;
		size--;
	}
	private void removeatindx(int idx) throws Exception {
		if(this.isEmpty()) {
			throw new Exception("LinkedList khali hai! ");
		}
		if(this.size()==idx) {
			throw new Exception("Gala idx ");
		}
		else if(idx==0) {
			removeFirst();
			
		}
		else if(idx==size-1) {
			removeLast();
			
		}
		else {
			Node idx_1=getNode(idx-1);
			Node idx_2=idx_1.next.next;
			idx_1.next=idx_2;
			size--;
		}
	}
	private void removeLast() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("LinkedList khali hai! ");
		}
		if(this.size()==1) {
			removeFirst();
			return;
			
		}
		else {
			Node n=getNode(size-2);
			n.next=null;
			tail=n;
			size--;
		}
	}
	private void reverse() {
		Node prev=null;
		Node cur=head;
		Node cnext=null;
		while(cur!=null) {
			cnext=cur.next;
			cur.next=prev;
			prev=cur;
			cur=cnext;
			
		}
		tail=head;
		head=prev;
//		Node temp=head;
//		head=prev;//tail;
//		tail=temp;
	}

	public static void main(String[] args) throws Exception {
		LinkedList ll=new LinkedList();
		ll.addLast(0);
		ll.addLast(98);
		ll.addLast(67);
		ll.addLast(789);
		ll.addFirst(2);
		ll.addFirst(4);
//		ll.getNode(2);
		ll.adAtIdx(ll.size(), 1);
		ll.display();
		System.out.println();
//		System.out.print(ll.getValu(4));
//		ll.removeFirst();
//		ll.removeLast();
//		ll.removeatindx(ll.size());
		ll.reverse();
		System.out.println();
		System.out.println(ll.size());
		ll.display();
	}

}
