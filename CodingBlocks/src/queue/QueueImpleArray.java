package queue;
//Java program for array implementation of queue
public class QueueImpleArray {
	int rear,front,size;
	int capacity;
	int array[];
	
	
	public QueueImpleArray(int capacity) {
		this.capacity=capacity;
		this.front=this.size=0;
		this.rear=capacity-1;
		array=new int[this.capacity];
	}
	
	
	boolean isFull(QueueImpleArray queue) {
		return (queue.size==queue.capacity);
	}
	
	
	boolean isEmpty(QueueImpleArray queue) {
		return (queue.size==0);
	}
	
	
	void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		this.rear=(this.rear+1)%capacity;
		array[this.rear]=item;
		this.size=this.size+1;
		System.out.print(item + " is enqueued\n");
	}
	
	
	int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = this.array[this.front];
		this.front=(this.front+1)%capacity;
		this.size=this.size-1;
		return item;
	}
	
	
	int rear() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.rear];
	}
	
	
	int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.front];
	}
	
	
	public static void main(String[] args) {
		QueueImpleArray q=new QueueImpleArray(1000);
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(21);
		q.enqueue(30);
		
		System.out.println(q.dequeue() + " dequeued from queue\n");
		
		System.out.println("Front item is " + q.front());

        System.out.println("Rear item is " + q.rear());
	}

}
