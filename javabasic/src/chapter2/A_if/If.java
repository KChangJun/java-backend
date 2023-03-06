package chapter2.A_if;

import java.util.Scanner;

public class If {

	
	// if 구문
	// 조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		// 단순 if 문
		// 조건이 true일 때 실행할 코드를 지정하는 구문
		// 사용 방법 : if(조건){ 조건이 true 일 때  실행할  코드}
		
		
		int age =12;
		
		
		if(age>19) System.out.println("성인입니다");	
		
		// if 문의  경우 코드 블럭에 오는 실행할 코드가 하나의 구문이면 
		// {}를 제거 하고 사용가능
		
	
		System.out.println("조건 검사 완료");
		// if - else문
		// 조건이 true일 경우와  false일 경우를 실행되는 코드를 각각 지정한 구문
		// 사용 방법은 : 
		//if(조건){true 일때 실행할 코드}
		//else{false 일때 실행할 코드} 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		if(age>19) { System.out.println("성인입니다");
		}
		else {System.out.println("미성년자 입니다");
		
		}
		System.out.println("");
		System.out.println("");
		
		//if 문과 마찬가지로 else 문도 코드블럭에 실행할 코드가 하나의 구문이면 {}를 제거하고 사용 가능
		if(age>19) System.out.println("성인입니다");
		else System.out.println("미성년자 입니다");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		// 중첩 if 문
		// if 문 혹은 else문의 코드블럭 안에 다시 if 문을 넣는것
		
		if (age<=19) {
			if(age<8) System.out.println("미취학 아동입니다");
			else System.out.println("청소년입니다.");
		}
		
		else {System.out.println("성인입니다");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		if (age>19) {System.out.println("성인입니다");
		} else {
			if(age<8) System.out.println("미취학 아동입니다");
			else System.out.println("청소년입니다");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		// if - else if - else 문
		// 중첩 if문의 응용
		// else  문의 코드 블럭에 오는 코드가 한 줄 일때 {}를 제거 할 수 있음을 이용
		// 
		
		if(age >19) {
			System.out.println("성인입니다");
		} else if(age<8) {
			System.out.println("미취학 아동입니다");
		} else { 
			System.out.println("청소년입니다");
		}
		

	
		
	}
}


	

	

