package chapter2.C_for;

import java.util.Arrays;

// for 반복문
// 규칙이 있는 작업을 반복하는 제어문
// 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문

public class For {

	public static void main(String[] args) {
	
		// 반복문을 사용하는 이유
		// 길이가 5인 int 타입의 배열(int array5)을 선언 및 생성
		int[] intArray5 = new int[5];
		// intArray5의 각 인덱스를 1~5까지 갓으로 초기화
		
//		intArray5[0] = 1;
//		intArray5[1] = 2;
//		intArray5[2] = 3;
//		intArray5[3] = 4;
//		intArray5[4] = 5;
//		
		// for 반복문
		// 특정하년수가 증감하며 조건에 부합하는 동안 반복하는 반복문
		// 사용 방법은:
		// for (변수 선언 혹은 초기화; 조건; 증감식){ 실행할 코드 }
		
		// 변수 선언  혹은 초기화: 반복문을 위해 사용할 변수를 선언 혹은 초기화
		// 조건: 반복을  계속 하기 위한 조건, true이면  반복, false 면 탈출
		// 실행할 코드 : 조건이 true일 때 실행할 코드
		// 작동순서는 변수 초기화 = a 조건 b 증감식  c 코드를 d 라고 치면
		// a - (b - d - c) - (b - d - c)  - (b - d - c) 의 순으로 반복된다
		
//		

		for(int index = 0; index < intArray5.length; index++ ) {
			// 1. index = n / n + 1
			
			intArray5[index] = index+1;
			
		}
		
		// for 문의 경우 코드 블럭에 오는 실행할 코드가 한  구문이염
		// {}를 제거 가능하다.

		
		
		// foreach 반복문
		// 배열의 요소 값을 직접 사용하곶자 할 때 배열을 반복하면서
		// 요소를 하나씩 복사해서 사용할 수 있음
		// 사용 방법:  for(배열요소의 데이터타입 변수명: 배열){실행할 코드}
		// 아래의 예시의 경우 number에 intArray5의 배열을 0부터 4까지 순서대로 집어넣고 출력한 것
		
		
		System.out.println(Arrays.toString(intArray5));
		System.out.println("읿반적인 for 문");
		for (int index = 0; index < intArray5.length; index++ ) {
			System.out.println(intArray5[index]);
			intArray5[index] = 10;
		}	
		for(int number: intArray5) {
			System.out.println(number);
		}
		System.out.println("for each문");
		for(int index = 0; index < intArray5.length; index++ ) {
			// 1. index = n / n + 1
			
			intArray5[index] = index+1;
			
		}
		
		for(int number: intArray5) {
			System.out.println(number);
			number = 10;
			
		}
		
		
		
		for (int number: intArray5) {
			System.out.println(number);
			
		}
	}
}
    	// 일반적인 for 문과 foreach 문의 차이를 보면 for 문에서 각 배열에 직접적으로 10을 집어넣었고
		// 그것을 다시 출력을 하면 전부 10이 나왔다.
		// 하지만 foreach 문에서 number에 10을 넣고 foreach문을 통해 intArray5를 실행했을때에는
		// 다시 원래대로 1~5 의 숫자가 나왔다.
		// 왜냐하면 foreach문은 intArray5의 배열을 직접사용하는것이 아니라
		// number이라는 변수에 intArray5를 복사하여(다시 집어 넣어) 사용하는 것이기 때문이다
	



