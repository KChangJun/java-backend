package chapter4.A_AccessModifier;

// 접근 제어자
// 멤버 또는 클래스의 접근 군한을 제한하는 제어자
// private : 같은 클래스 내에서만 접근이 가능 (사용률 높음)
// default : 같은 패키지 내에서만 접근이 가능 (사용률 낮음)
// protected : 같은 패키지 내에서 그리고 다른 패키지의 자손 클래스 에서 접근이 가능 (사용률 낮음)
// public  : 모든 공간에서 접근이 가능 (외부의 모든 클래스에서 사용가능) (사용률 높음)
public class Example4 {
	protected int number4;
	private void function4(){}
	private Example4(){}
	
}
