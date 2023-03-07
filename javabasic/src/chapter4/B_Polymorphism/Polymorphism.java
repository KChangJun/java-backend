package chapter4.B_Polymorphism;

// 부모 클래스를 자손클래스에 대입시킬때 형변환을 시켜야 하는 이유는
// 부모클래스의 속성을 a,b,c 자손을 a,b,c,d 라고 했을때
// 부모클래스는 자손클래스를 모두 설명할수 없기 때문에
// 형변환을 통해 강제로 설명하는 것이고
// 반대로 자손 클래스는 부모클래스를 가진 그대로 모두 설명할수 있기때문에
// 자동 형 변환이 가능하다


// 다형성
// 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조 할 수 있도록 하는 것
// 참조변수의 형변환

class SuperClass{
	int number1;
	int number2;
	SuperClass(int number1, int number2){
	this.number1=number1;
	this.number2=number2;
	}
	
	
	void method1() {}
	void method2() {}	
}

class SubClass1 extends SuperClass{
	int number3;
	
	SubClass1(int number1, int number2, int number3){
		super(number1, number2);
		this.number3=number3;	
	}
	void method3() {}
}
class SubClass2 extends SuperClass{
	SubClass2(int number1, int number2){
		super(number1, number2);			
		}
	
	void method1() {
		System.out.println("Override");
		
		
	}

}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass superClass = new SuperClass(1,2); //인스턴스생성 = 값이 있는 주소를 생성한다. 값에 집중하지말고 주소에 집중하자. 주소주소
		SubClass1 subClass1 = new SubClass1(11,22,33);
		SubClass2 subClass2 = new SubClass2(111,222);
		
		// 자손타입 -> 조상타입 (up casting) :자동 형변환 가능
		SuperClass super1=subClass1;
		SuperClass super2=subClass2;
		System.out.println(subClass1.number3);
		
		SubClass1 sub1 = (SubClass1)super1; // sub1 에는 super1을 대입했기에 num3가 없는데
		System.out.println(sub1.number3); //출력하면 num3가뜬다 값을 대입하는게 아닌 주소를 일치시키는 것이기 때문. 잘 기억하자
		
		
		super2.method1();//형변환을 해도 메서드는 오버라이드 한 값이 나온다.
		
		SuperClass[] list = new SuperClass[3];
		list[0] = new SubClass1(1,2,3);
		list[1] = new SubClass2(1,2);
		list[2] = new SuperClass(1,2);
		
		
		
		
		
		
		// 참조변수의 형변환을 한다고 하더라도 인스턴스가 가지고 있는 데이터에는
		// 아무런 영향을 미치지 않음
		// 단지 인스턴스의 사용 범위를 조절하는 것
		
		
		
		
		
		//조상타입 -> 자손타입 (Down casting) : 자동 형변환 불가능
//		SubClass1 sub1=(SubClass1)superClass;
//		SubClass2 sub2=(SubClass2)superClass;
//		
		
		
		
		
		
//		subClass1.number1=5;
//		
//		superClass = subClass1;
//		System.out.println(subClass2.number1);
//		subClass2 = (SubClass2)superClass;
//		subClass2.number1=10;
//		System.out.println(subClass1.number1);
//		
		
		
		
		
	}

}
