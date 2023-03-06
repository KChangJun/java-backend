package chapter1.F_Operator;

import java.util.Arrays;

// 연산자
// 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자 가 있따따따

public class operator {
	public static void main(String[] args) {

	// 산술 연산자
	// 던셈 연산자 :
	// 좌항에 우항을 더한 값을 반환
	int addResult = 8 + 3;
	System.out.println(addResult);

	// 뺄셈 연산자 :
	// 좌항에 우항을 뺀 값을 반환
	int  minusResult = 8 - 3;
	System.out.println(minusResult);
	
	
	// 곱셈 연산자 ;
	// 좌항에 우항을 곱한 값을 반환
	
	int multiResult = 8 * 3;
	System.out.println(multiResult);
	
	// 나누기 연산자 ;
	// 좌헹에 우항을 나눈 값을 반환
	// 단 양쪽다 정수일 경우 몫만을 반환하고
	// 하나라도 실수가 들어가면 데이터 범위 내의 오차 내로 반환한다.
	
	
	int divideResult = 8/3;
	
	float float1 = 2.66666f; 
	int number1= (int) float1;
	
	System.out.println(number1);
	System.out.println(divideResult);
	
	double divideResult2  = 8.0/3.0;
	System.out.println(divideResult2);
	
	
	// 나머지 연산자 : %
	// 좌항에 우항을 나눈 나머지를 반환
	
	int remainderResult1=8%3;
	System.out.println(remainderResult1);
	double remainderResult2=8.0 % 3;
	System.out.println(remainderResult2);
	
	
	
	
	// 정수와 전수를 연산하면 정수가 반환된다.
	// 단 실수가 좌,우항중 하나에 들어가게되면 실수가 반환된다.
	// 당연히 실수와 실수가 연산되면 실수가 반환됨
	
	
	
	// 증감 연산자 : '변수' 자신을 1 증가 혹은 감소 시키는 연산자
	
	// 증가 연산자 : ++
	// 연산자의 좌항 혹은 우항의 값을 1 증가 시킴
	// ++가 좌측에 있을경우 숫자를 증가 시키고 출력
	// ++가 우측에 있을경우 출력을 하고 숫자를 증가
	
	int integer1 = 10;
	++integer1;
	System.out.println(integer1);
	integer1++;
	System.out.println(integer1);
	integer1 = 0;
	System.out.println("기본 변수값 :" +integer1);
	System.out.println("================");
	
	System.out.println("++가 좌측에 있을경우 :"+ ++integer1);
	
	System.out.println("++가 우측에 있을경우 :"+ integer1++);
	System.out.println("그 다음값을 그대로 반환할경우 :" +integer1);
	
//	final int NUMBER1 = 0;
//	NUMBER1++;
//	3++;
	// 변수에만 적용되기 때문에 위의 상수에는 적용 되지 않는다
	
	// 감소 연산자 : --
	// 연산자의 좌항 혹은 우항의 값을 1 감소 시킴
	// --가 좌측에 있을경우 숫자를 감소 시키고 출력
	// --가 우측에 있을경우 출력을 하고 숫자를 감소
		
	int integer2=10;
	
	integer2--;
	System.out.println(integer2);
	--integer2;
	System.out.println(integer2);
	
	int number2 = 8;
	int number3 = 3;
	int sampleNumber = number2/number3++;
	
	System.out.println("");
	System.out.println("++의 위치가 number3의 우측이기 때문에 나오는 값은 8/3의 2가된다");
	System.out.println(sampleNumber);
	System.out.println("그리고 ++가 작동했기 때문에 number3은 4가 된다");
	System.out.println(number3);
	
	
	
	
	// 대입연산자
	// 좌항에 우항을 (누적)대입
	// 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
	
	
	// = : 좌항에 우항을 대입
	
	System.out.println("");
	int number4 = 10;
	// 심플하게 대입
	// += : 좌항에 우항을 더한 값을 좌항에 대입
	
//	number4  += 3;
	System.out.println(number4+=3);
	// -= : 좌항에 우항을 뺀 값을 좌항에 대입
	
	number4  -= 6;
	System.out.println(number4);

	// *= : 좌항에 우항을 곱한 값을 좌항에 대입
	number4 *=  3;
	System.out.println(number4);
	
	// /= : 좌항에 우항을 나눈 값을 좌항에 대입
	number4 /= 5;
	System.out.println(number4);
	
	// %= : 좌항에 우항을 나눈 나머지를 좌항에 대입
	number4 %=3;
	System.out.println(number4);

	// 대입연산자의 좌항에는 변수만 온다
	
	number4 = number4 % 3;
	
	
	// 비교 연산자
	// 좌항을 우항과 비교한 결과를 논리값(false, true)갓으로 반환
	
	// ==
	// 좌항이 우항과 같다면 true를 반환, 아니면 false를 반환
	
	System.out.println("");
	System.out.println("논리 연산자 ");
	boolean boolean1 = 10 == 12;
	
	System.out.println(boolean1);
	
	// !=
	// 좌항이 우황과 다르다면 true 아니면 false를 반환
	
	boolean boolean2 = 10 != 12;
	
	System.out.println(boolean2);
	
	
	//  >,>=
	// 좌항이 우항보다 크면 true, 아니면 false 반환
	// 좌항이 우항보다 크거나 같으면 true 아니면 false 반환
	
	boolean boolean3 = 10> 10;
	boolean boolean4 = 10>= 10;
	
	System.out.println(boolean3);
	System.out.println(boolean4);
	
	// <, <=
	// 좌항이 우한보다 작으면 true, 아니면 false 반환
	// 좌항이 우한보다 작거나 같으면 true 아니면 false 반환
	
	boolean boolean5 = 8<10;
	boolean boolean6 = 10<=10;
	
	System.out.println(boolean5);
	System.out.println(boolean6);
	
	
	// 논리 연산자
	// 논리 값을 연산하는 연산자
	// 좌항 우항 모두 논리값이 들어가야한다
	
	// && : and 연산 
	// 좌항과 우항이 모두 true 일때  true 아니면 false 반환
	
	boolean true1=true;
	boolean true2=true;
	int number5 = 8;
	int number6 =3;
	boolean boolean7 = number5>number6  && true;
	boolean false1=false;
	boolean false2=false;
	
	System.out.println("논리연산자");
	
	System.out.println("논리연산자 true&&false의 결과:"+ (true1&&false1));
	
	// || : or 연산
	// 좌항과 우항 중 하나라도 ture이면 true, 아니면 false
	
	boolean boolean8= false||true;
	System.out.println(boolean8);

	
	boolean boolean9 = number5>number6 && number6>number5;
	System.out.println(boolean9);
	
	
	boolean boolean10 = (number5>number6) || (number6>number5++);
	// number5의 경우 ++로인해 9가 되어야 할것 같지만
	// ||의 특징으로 true가 하나만 있어도 true 값이 반환 되기 때문에
	// number5>number6가 ture가 나온 시점에서 뒤 의 연산을 하지않는다
	// 그렇기 때문에 number5는 8의 값을 그대로 유지한다
	// 좌에서 우로 읽지만 결과값이 나오게 되면 거기서 추가로 더 읽는 행위를 하지 않는다
	// &&에도 마찬가지로 적용된다
	
	
	// !: NOT 
	// 부정 연산자
	// 논리 값의 부정을 반환한다 true 라면 false로 false 라면 true값으로 바꾼다
	System.out.println("");
	System.out.println("부정연산자");
	boolean boolean11 = !(number5>number6) ;
	System.out.println(boolean11);
	
	
	
	System.out.println("");
	System.out.println("삼항연산자");
	// 삼항연산자
	// 조건에 따라 다른 결과를 반환하는 여난자
	// 조건=연산결과가 true false 혹은 값이 true false인 논리결과값
	// 사용법 :   조건 ? 참일때 결과 : 거짓일떄 결과
	
	String  string1 = number5>number6 ? "3보다 큽니다" : "3보다 크지않습니다";
	System.out.println(string1);
	
	
	
	}
	
}


