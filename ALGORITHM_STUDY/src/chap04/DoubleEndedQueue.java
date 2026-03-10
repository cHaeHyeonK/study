package chap04;

public class DoubleEndedQueue {
//	내 생각 : front랑 rear가 각각 하나의 스택처럼 움직임 (선입선출이 아니라 후입선출처럼 됨)
	
	private int[] que;
	private int capacity;
	private int num;
	
	private int front_ptr; //실제 데이터가 어디 있는지
	private int rear_ptr; //실제 데이터가 어디 있는지
	
	@SuppressWarnings("serial")
	class EmptyDoubleEndedQueueException extends RuntimeException {
		public EmptyDoubleEndedQueueException() {}
	}
	
	@SuppressWarnings("serial")
	class OverflowDoubleEndedQueueException extends RuntimeException {
		public OverflowDoubleEndedQueueException() {}
	}
	
	public DoubleEndedQueue(int maxlen) {
		capacity = maxlen;
		front_ptr = num = 0;
		
		
		try {
			que = new int[capacity];
			rear_ptr = capacity - 1;
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	
	public int enque(int n, int x) throws OverflowDoubleEndedQueueException {
		if(num >= capacity) throw new OverflowDoubleEndedQueueException();
		
//		프론트에 넣는다고 생각하기...
		if(n == 0) {
			que[front_ptr++] = x;
			num++;
		} else {
			que[rear_ptr--] = x;
			num++;
		}
		
		return x;
	}
	
	public int deque(int n) throws EmptyDoubleEndedQueueException {
		if(num <= 0) throw new EmptyDoubleEndedQueueException();
		int x;
		if(n == 0) {
			x = que[--front_ptr];
			num--;
		} else {
			x = que[++rear_ptr];
			num--;
		}
		
		return x;
	}
	
	public int peek(int n) throws EmptyDoubleEndedQueueException {
		if(num <= 0) throw new EmptyDoubleEndedQueueException();
		
		if(n == 0)
			return que[front_ptr];
		else
			return que[rear_ptr];
	}
}
