package chap04;

public class IntArrayQueue {
	private int[] que; //큐 배열
	private int capacity; //큐 용량
	private int num; //데이터 개수
	
	@SuppressWarnings("serial")
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	@SuppressWarnings("serial")
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntArrayQueue(int array_capa) {
		capacity = array_capa;
		num = 0;
		
		try {
			que = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enqueue(int x) throws OverflowIntQueueException {
		if(num >= capacity) throw new OverflowIntQueueException();
		
		return que[num++] = x;
	}
	
	public int dequeue(int x) throws EmptyIntQueueException {
		if(num <= 0) throw new EmptyIntQueueException();
		
		int n = que[0];
		num--;
		
		for(int i = 0; i < num; i++) {
			que[i] = que[i+1];
		}
		
		return n;
	}
}
