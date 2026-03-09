package chap04;

// 자바 메모리 구조 : 메서드(클래스, 클래스 변수) -> 힙(객체 인스턴스) -> 스택(메서드, 지역변수, 매개변수)
// 메서드 영역에 있는 건 실행시에 이미 메모리에 올라가 있는 상태
// 스택에 있는 건 실행 후에 가비지 컬렉터가 제거함 (메모리 효율 올라감)

public class GenericStudy02<K, V> {
	private K first;
	private V second;
	
	void set(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	
	V getSecond() {
		return second;
	}
	
	<T> T genericMethod(T o) {
		return o;
	}
	
	
//	static은 실행할 시에 바로 메모리에 올라가 있음 -> 호출도 ClassName.Method() 이런 식이니까 넣는 인자값이 바로 타입이 됨
//	그래서 클래스에서 사용한 제네릭과는 달리 독립적으로 사용
	static<T> T genericMethod02(T o) {
		return o;
	}
	
	public static void main(String[] args) {
		GenericStudy02<String, Integer> a = new GenericStudy02<String, Integer>();
		a.set("10", 10);
		
		System.out.println("first data : " + a.getFirst());
		
		System.out.println("K type : " + a.getFirst().getClass().getName());
		
		System.out.println("second data : " + a.getSecond());
		
		System.out.println("V type : " + a.getSecond().getClass().getName());
		
		System.out.println("T type : " + a.genericMethod("10").getClass().getName());
		
		System.out.println("static T type : " + a.genericMethod02(10).getClass().getName());
	}
}
