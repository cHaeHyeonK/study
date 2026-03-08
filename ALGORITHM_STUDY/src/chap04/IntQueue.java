package chap04;

public class IntQueue {
//	선입선출 (들어온 순서대로 나감)
//	매번 0번 자리에서 dequeue를 하면 할 때마다 자리를 앞으로 당겨야 해서 비효율적임 (그 대신에 나가는 출구를 뒤로 미는 식)
//	rear는 들어오는 입구, front는 나가는 입구
	
	private int[] que; //큐용 배열
	private int capacity; //큐의 용량
	private int front; //맨 앞의 요소 커서
	private int rear; //맨 뒤의 요소 커서
	private int num; //현재 데이터 개수
	
//	큐가 비어있을 때 예외
	@SuppressWarnings("serial")
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
//	큐가 가득 찼을 때 예외
	@SuppressWarnings("serial")
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int maxlen) {
		capacity = maxlen;
		num = front = rear = 0;
		
		try {
			que = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= capacity) throw new OverflowIntQueueException();
		
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}
	
//	어떤 값을 뺐는지 리턴
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		
		int x = que[front++];
		num--;
		
		if(front == capacity)
			front = 0;
		return x;
	}
	
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		
		return que[front];
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
//	(i + front) % capacity 하는 이유 : idx 값이 배열의 인덱스를 넘어가면 예외 호출되는데
//	저 식을 이용하면 마지막 인덱스 다음으로는 0이 들어옴
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= capacity;
	}
	
//	front -> rear 순서로 출력
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i = 0; i < num; i++)
				System.out.print(que[(i + front) % capacity] + " ");
			System.out.println();
		}
	}
}
