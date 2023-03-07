package chapter4.D_Interface;

// 인터페이스
// 추상 클래스보다 추상화 정도가 높은 존재 , 시스템 설계에 자주 이용됨
// 추상 클래스와 다르게 일반 메서드와 일반 멤버 변수를 가질 수 없다.

// 사용 방법:
// interface 인터페이스명 {  }
interface ExampleInterface {
	// 변수를 사용할 때에는 public static final 형태로만 사용 할 수 있음
	public static final int NUMBER = 10;
	
	// 메서드를 사용 할 때는 public abstract 로 선언해야함

	public abstract void method1();
	public void method2();
	void method3();
}

// 인터페이스 간의 상속
// , 를  써서 다중 상속이 가능하다
interface SubExampleInterface extends ExampleInterface{

}

// 인터페이스 구현
// 인터페이스도 추상 메서드를 포함하고 있기 때문에 \
// 해당 메서드를 구현하는 클래스를 통해서 인스턴스를 만들어 줘야함
// 인터페이스를 클래스에 구현 할 때는 implements 키워드를 사용
class Implement implements ExampleInterface{
	public void method1() {
		System.out.println("메서드1");
	}
	public void method2() {
		System.err.println("메서드2");
	}
	public void method3() {
		System.err.println("메서드3");
	}
	
	
}

public class Interface {

	public static void main(String[] args) {
		// 인터페이스 자체로 인스턴스를 생성 할 수 업ㅄ음
		ExampleInterface exampleInterface = new Implement(); 
		
		
	}
}



//                                /\
//							  |__/||\__|
//     							/_||_\	
//							   /______\
//                              || ||