package chapter1.C_dataType;


// 데이터 타입
// 각각의 데이터들은 자바에서 지정한 여러 종류의 타입이 존재
// 기본적으로 정수형, 실수형, 문자형, 논리형이 존재한다
// 추가적으로 참조형 데이터타입

// 일반적으로 특정한 데이터 타입으로 정의된 변수 혹은 상수는
// 같은 데이터 타입의 데이터로만 연산이 가능




public class DataType {

	public static void main(String[] args) {
		// 정수 타입
		// byte type 
		// 1 byte (-128~127)의 크기의 데이터를 가질 수 있는 데이터 타이
		
		byte byte1 = 127;
		// byte1= 128;
	
		System.out.println(byte1);
	
		// short type
		// 2byte (-32,768~32,767)
		short short1 = 32767;
		
		// int type
		// 4  byte (-2,147,483,648 ~ 2,147,483,647)
		
		int int1 = 2_147_483_647;
		// 큰수를 표현할때에는 천단위에 _를 콤마처럼 쓸  수 있다
		//	int1 = 2148483648;
		// 리터럴 상수는 데이터저장 종류가 int 범위 내에만 들어가기 때문에 
		//	int 범위를 넘어서는  리터럴상수를 넣을수  없다
		
		//long type
		// 8byte (-2^63 ~ 2^63  -1) 크기의  데이터를 가질 수 있는 정수형
		
		long long1= 12_147_483_647L;
		
		// long 정수 타입의 리터럴 상수는 숫자 끝에 L혹은 l 을 붙여서 사용한다
		
	
		
		// 실수 타입
		// float type
		// 4byte (1.4 * 10^-45 ~ 3.4 * 10^38) 크기의 데이터를 가질 수 있는 실수형 데이터 타입
		float float1 = 3.141592f;
		// 실수 리터럴  상수는 기본타입이 double 이기 떄문에 long 과 마찬가지로 끝에 f를 붙인다
		// float은 소수점 6자리에서 오차발생
		
		
		// double type
		// 8byte (4.9* 10^-324 ~ 1.8* 10^308) 크기의 데이터를 가질 수 있는 실수형 데이터 타입
		double double1 = 3.14;
		// double은 소수점 15자리에서 오차발생		
		

	
		// 문자 타입 
		// char type
		// 2 byte(0~ 65,535) 크기의 데이터를 가질 수 있는 문자형 데이터 타입
		// 문자(단어가 아님!) 하나를  저장 할 수 있는 공간
		// 한 문자를 푝 할 땐' ' 으로 묶어서 표기
		// ex) 'a'
		char char1 = 'a';
		char char2 = 97;
		System.out.println(char1);
		System.out.println(char2);
		
	
		
		// 논리 타입
		// boolean type
		// 1 byte 
		// true(1) or false(0) 2택 크기의 데이터를 가질 수 있는 논리형 데이터 타입
		
		boolean boolean1=true;
		
		System.out.println(boolean1);
		boolean1 = false;
		System.out.println(boolean1);
		
		// is**, has** 식의 변수명을 자주설정한다. true false 2택인 논리적 구조이기 때문
		// flag 도 잘 쓴다
		// boolean, int, double 순으로 자주 쓰인다
		
		// 형 변환(Type casting)  
		// 자동 형 변환 (묵시적 형 변환)
		// 차지하는 범위가 작은 데이터 타입은 범위가 큰 데이터 타입으로 자동 형변환 됨
		short short2 = 1;
		int int2 = short2;
		char char3 = 10;
		short2 = (short) char3;
		int2= char3;
		System.out.println(int2);
		
		System.out.println(short2);
		//short <> char는 데이터 크기가 같음에도 묵시적 형변환이 되지 않는데 데이터 크기는 같지만 범위가 다르기 때문이다.
		//short 의 경우에는 음수가 표현되고 char의 경우에는 양수의 범위만이기 때문이다.
		//동일한 이유로 float<> int도 불가하다
		
		
		int int3 = 1;
		short short3 = (short) int3;
		System.out.println(short3);
		
		// 강제 형 변환(명시적 형 변환)
		// 차지하는 범위가 큰 데이터 타입은 범위가 작은 데이터 타입으로 대입할때 형 변환을 명시해야함
		// 강제 형 변환의 경우에는 overflow(범위초과)가 발생할수있음
		// 기본 데이터 타입을 형 변환 하는 경우는 거의 없다
	
		short2 = (short)int3;
		System.out.println(short2);
		
		
		
		// 참조형 데이터 타입
		// 기본데이터 타입이 아닌 메모리 주소를 참조하는 데이터 타입
		// 클래스 같은거
		// 기본 데이터 타입과 다르게 첫문자가 대문자로 시작됨
		// 대표적인 참조형 데이터 타입 : String < 문자열을 담을 수 있는 데이터 타입
		// Stirng 은 문자가 아니라 주소를 가지고 있는거다
		
		String string1 = "문자열 치 킨 먹 고 싶 다";
		System.out.println(string1);
		
		
		
		
	}

}






