package chapter2.C_While;


// while 반복문
// 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문



public class While {

	public static void main(String[] args) {

		// while문
		// 조건을 검사하고 해당 조건이 true일 경우 코드 블럭을 실행(if 문과 같이)하는 반복문
		// if문의 반복문 형태
		// 반복 실행할 코드 블럭이 종료되면 조건을 다시 검사하고 
		// true면 반복, false면 탈출
		// 사용 방법: while(조건){실행할코드} 
	
		
		int number = 0;
		
		while (true) {
			
			
			// continue: 반복문이 continue문을 만나면 코드블럭내에서 아래에 오는 
			// 모든 코드를 무시하고 다시 조건을 검사함
			// 일반적으로 continue문은 조건문과 함께 쓰임
			// ! 조건문의 코드 블럭내에 해당 변수를 변경시켜주는 코드가 존재해야함
			if((number %2)==1) { // 홀수는 출력하지 않기
				
				number++;
				continue;
			}
			System.out.println(number);
			
			
		// 조건에 대한 변수가 while 실행 코드 블럭 내에서 변경이 있어야 한다
			
			
			
			// break: 반복문의 코드 블럭을 강제로 종료 시킬때 사용
			// break 문은 일반적으로 if 문과 함께 사용된다
	
					
			
			if (number ==20) {
				break;
					}
			number++;
		
			}
			
		
		
		
		// do -while
		// 반복실행할 코드를 무조건 한번 실행 한 후에 조건을 검사하는 반복문
		// 사용 방법: do{실행할 코드 } while(조건);
		System.out.println("");
		System.out.println("do - while");
		
		number = 0;
		
		do { 
			System.out.println(number);
			number++;
		} while (number <20);
		System.out.println("종료");
		System.out.println(number);
		
		}

}

