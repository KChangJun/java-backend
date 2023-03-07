package chapter4.C_AbstractClass;

// 추상 클래스
// 추상 메서드가 포함되어 있는 클래스
// 추상 클래스로 인스턴스를 생성할 수 없음! <-중요

// 사용 방법 :
// abstract class 클래서명 {}
abstract class Abstract{
	int number1;
	// 추상 메서드
	// 선언부만 작성이 되어 있고 구현부는 작성되어 있지 않은 메서드
	// 해당 클래스를 상속받은 자손 클래스에서 구현을 필수로 요구함
	
	// 사용 방법 :
	// abstract 반환타입 메서드명 ([매개변수]);
	abstract void method1();
}

class SubClass extends Abstract{
		void method1() {
			System.out.println("구현부!");
	}
	
}



public class AbstractClass {
	
	public static void main(String[] args) {
	
		Abstract abstract1 = new SubClass(); // SubClass 로 Abstract를 설명 가능하기 때문에 인스턴스 생성완료

		//		Abstract abstract1 = new Abstract(); 추상 클래스는 인스턴스 생성 불가!			
	
	}
	
}
 