package chap04;



public class Queue<E> {
//	제네릭으로 큐 만들기
	private E[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;
	
//	enqueue, dequeue, peek
	
	@SuppressWarnings("unchecked")
	public Queue(int maxlen) {
		
		num = front = rear = 0;
		capacity = maxlen;
		
		try {
			
			que = (E[]) new Object [capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public E enque(E x) throws OverflowQueueException {
		if(num >= capacity) throw new OverflowQueueException();
		
		que[rear++] = x;
		num++;
		
		if(rear >= capacity)
			rear = 0;
		
		return x;
	}
	
	public E deque() throws EmptyQueueException {
		if(num <= 0) throw new EmptyQueueException();
		
		E x = que[front++];
		num--;
		
		if(front >= capacity)
			front = 0;
		
		return x;
	}
	
	public E peek() throws EmptyQueueException {
		if(num <= 0) throw new EmptyQueueException();
		
		return que[front];
	}
}

@SuppressWarnings("serial")
class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {}
}

@SuppressWarnings("serial")
class OverflowQueueException extends RuntimeException {
	public OverflowQueueException() {}
}