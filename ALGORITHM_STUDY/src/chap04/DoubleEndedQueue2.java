package chap04;

// front : capacity -1 -> capacity -2 ... -> 0으로 감
// rear : 0 -> 1 -> 2 -> 3 ...

// 출구는 front, 입구는 rear 라기보다는 링 형태를 최대화한 느낌
// (front : 넣을 때 반시계방향으로 한 칸, 뺄 때는 시계 방향으로 한 칸)
// (rear : 넣을 때는 시계 방향으로 한 칸, 뺄 때는 반시계 방향으로 한 칸)

public class DoubleEndedQueue2 {
	private int[] que;
	private int capacity;
	private int num;
	
	private int front;
	private int rear;
	
	
	@SuppressWarnings("serial")
	class EmptyDoubleEndedQueueException extends RuntimeException {
		public EmptyDoubleEndedQueueException() {}
	}
	
	@SuppressWarnings("serial")
	class OverflowDoubleEndedQueueException extends RuntimeException {
		public OverflowDoubleEndedQueueException() {}
	}
	
	public DoubleEndedQueue2(int maxlen) {
		capacity = maxlen;
		front = rear = num = 0;
		
		
		try {
			que = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}

	
	public int enque(int n, int x) throws OverflowDoubleEndedQueueException {
		if(num >= capacity) throw new OverflowDoubleEndedQueueException();
		
		if(n == 0) {
			front = (front - 1 + capacity) % capacity;
			que[front] = x;
			num++;
		} else {
			que[rear] = x;
			rear = (rear + 1) % capacity;
			num++;
		}
		
		return x;
	}
	
	public int deque(int n) throws EmptyDoubleEndedQueueException {
		if(num <= 0) throw new EmptyDoubleEndedQueueException();
		
		int x;
		
		if(n == 0) {
			x = que[front];
			front = (front + 1) % capacity;
		} else {
			x = que[rear];
			rear = (rear - 1 + capacity) % capacity;
		}
		
		return x;
	}
	
	
}
