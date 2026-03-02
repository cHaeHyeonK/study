package chap04;

public class IntQueue {
//	선입선출 (들어온 순서대로 나감)
//	매번 0번 자리에서 dequeue를 하면 할 때마다 자리를 앞으로 당겨야 해서 비효율적임 (그 대신에 나가는 출구를 뒤로 미는 식)
	
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
}
