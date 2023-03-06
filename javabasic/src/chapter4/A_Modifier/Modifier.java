
package chapter4.A_Modifier;
import chapter4.A_AccessModifier.Example4;

// 제어자
// 클래스, 변수, 혹은 메서드의 선언부에서 사용되는 부가적 의미를 추가해주는 키워드

// 접근제어자 : public, protect, default, private

// 기타 제어자 : static, abstract, final etc..

// 하나의 대상에 여러개의 제어자를 종합해서 사용 할 수 있음.
// 단, 접근 제어자는 한 선언에 대하여 한번만 사용 할 수 있음
// 제어자의 순서는 무관


	//static 제어자
	// 해당 제어자가 포함되어 있는 선언문은 클래스 단위로 사용 가능하도록 함
	// 멤버 변수, 멤 메서드에서 사용가능
class Example1{
	static int number1; // static 으로 클래스 변수가 되엇기 때문에 인스턴스 생성 없이도 사용 가능함
	static void function1() {}
}


	// final 제어자
	// 해당 제어자가 포함되어 있는 선언문은 변경이 불가능하도록 함
	// 클래스, 메서드, 변수에서 사용 가능
	
	// 클래스 선언문에 final이 포함되면 해당 클래스를 상속하지 못함
final class Example2{
	// 메서드 선언문에 final이 포함되면 해당 메서드를 오버라이드 하지 못함
	final void function2() {}
	// 변수 선언문에 final 이 포함되면 초기화 한 후 해단 변수의 값을 변경하지 못함
	final int number2=11; 	
}

// abstract 제어자
// 해당 제어자가 포함되어 있는 선언문은 선언만 되어있고 구현읜 도어있지 않음을 나타냄
// 클래스, 메서드에서 사용 가능

// 클래스 선언문에 abstract가 포함되어 있으면 해당 클래스는 구현되지 않은 메서드를 포함하고 있음을 의미한다.
abstract class Example3{
	abstract void function3();//구현부가 없다. abstract이기 때문에 자손 클래스에서 Overriding 해서 사용한다.
							  //메서드 선언문에 abstract가 포함되어 있으면 해당 메서드는 구현되지 않앗음을 의미
	
}



public class Modifier {

	public static void main(String[] args) {

		Example4 example4= new Example4();
		example4.number4 = 10;
	}

}
