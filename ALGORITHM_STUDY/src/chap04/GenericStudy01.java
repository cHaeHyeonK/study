package chap04;

public class GenericStudy01<E> {
//	클래스 내부에서 타입을 지정하는 게 아니라 외부 사용자가 지정함
//	코드 재사용성 높이고 잘못된 타입이 들어오는 걸 막을 수 있음 
	
	private E element;
	
	public void set(E element) {
		this.element = element;
	}
	
	public E get() {
		return element;
	}
	
	public static void main(String[] args) {
		GenericStudy01<String> a = new GenericStudy01<String>();
		GenericStudy01<Integer> b = new GenericStudy01<Integer>();
		
		a.set("10");
		b.set(10);
		
		System.out.println("a data : " + a.get());
		System.out.println("a E type : " + a.get().getClass().getName());
		System.out.println();
		
		System.out.println("b data : " + b.get());
		System.out.println("b E type : " + b.get().getClass().getName());
	}
}
