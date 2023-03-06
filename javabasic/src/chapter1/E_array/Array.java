package chapter1.E_array;

import java.util.Arrays;

// 배열
// '같은 타입' 의 변수가 나열된 형태
// 배열은 '생성' 해서 사용함 => 생성해서 사용하는 변수 : 참조 변수
// new 연산자로 생성 할 수 있음
// 배열은 실제로 데이터가 저장되는 것이 아니라
// 데이터 배열이 저장된 첫 번째 메모리 주소가 저장됨



public class Array {

	public static void main(String[] args) {
		//		String string1 = new String();
		//  동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		
		int score1, score2, score3, score4, score5;
		score1 = 90;
		score2 = 100;
		score3 = 70;
		score4 = 60;
		score5 = 80;
		// 위 방식의 문제점
		// 관리가 어렵고, 특정조건의 데이터를 가져오기도 불편하다
		
		// 배열
		// 동일 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태
		// 선언 바업 : 데이터타입 [] 배열명;
		
		
		int[] scores;
		// 묶음형태 배열 같은 변수들은 array, ~s, list 등을 붙인다
		// 생성 방법 : 배열명 = new 데이터타입[배열의길이];
		scores = new int[5];
		// 초기화 방법 : 배열명[인덱스번호] = 데이터;
		// 인덱스는 0 부터 시작한다

		scores[0]=90;
		scores[1]=900;
		scores[2]=1000;
		scores[3]=2520;
		scores[4]=2220;
		

		// 선언과 동시에 생성 및 초히과
		// 1. 데이터 타입[] 배열명 = new 데이터타입[길이]
		
		int[] scoreList= new int[] {90, 1000, 95,122};
		System.out.println(scoreList.length);
		
		// 2. 데이터타입[] 배열명 = {요소1, 요소2, 요소3, ....};
		
		char[] strings = {'h', 'e', 'l','l', 'o'};
		
		System.out.println(strings);
		strings[0] = 'k';
		System.out.println(strings[0]);
		// 다차원 배열
		// 선언 방법: 데이터타입[][] 배열명;
		// 생성 방법: 배열명 = new 데이터타입[첫번째 배열길이][두번째 배열 길이];
		
		// 선언과 동시에 초기화
		// 1. 데이터타입[][] 배열명 = new 데이터타입[][]  {  {요소11,요소12,요소13,....},{요소21,오소22,요소23,.....} {...}}	;
		// 2. 데이터타입[][] 배열명 = {  {요소11,요소12,요소13,....},{요소21,오소22,요소23,.....} {...}}  ;	
//		
		
		
		//int[] scoreList= new int[] {90, 1000, 95,122};
		int[] extraScoreList = scoreList;
		System.out.println(scoreList);
		System.out.println(extraScoreList);
		extraScoreList[0]=70;
		System.out.println(Arrays.toString(extraScoreList));
		System.out.println(Arrays.toString(scoreList));
		System.out.println();
		// 메모리 주소를 바꾸는 것이기 때문에
		// 우항에서 좌항으로 대입을 하는것임에도
		// 양쪽다 내용물이 바뀌게된다. 내용물은 달라졋어도  같은 주소를 보고 있기 때문.
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<strings.length;i++) {
//			System.out.println(strings[i]);
//		
//
//		}
//		int[] numbers = new int[7]; 
//		
//		
//		for(int i=0;i<numbers.length;i++) {
//			numbers[i]= i+1;
//			System.out.println(numbers[i]);
//			
//			
//		}
//	
	}

}

