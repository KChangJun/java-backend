package chapter1.D_IO;

import java.util.Scanner;
// 외부 라이브러리에서 스캐너 추가됨 

public class Io {

	
// io = input output의 줄임말	
// console을 통해서 개발자로 부터 입력을 받을 때 Scanner 객체를 사용 함
// console로 데이터를 출력할 땐 System 객체를 사용함 
	public static void main(String[] args) {
		//출력
		// System.out.println (츨력하고자 하는 변수 상수 등 내용);
		String comment = "이것은 변수에 저장된 문자열입니다.";
		System.out.println("이것은 리터럴 상수 문자열입니다");
		System.out.println(comment);
		
		float float1 = 1.111111111111f;
		
		System.out.println(float1);
		// System.out.println(변수 혹은 상수);
		// 변수 혹은 상수 자리에 어떤 데이터 타입이 와도 됨
	
		
		
		//입력
		// Scanner scanner = new Scanner(System.in);
		
		
		
		
		Scanner scanner= new Scanner(System.in);
		// scanner 참조변수 < 메모리주소가 들어간다 데이터가 아님. 주소임                
		System.out.println(scanner);
		// Scanner 객체의 .next**() 메서드 를 사용해서 입력을 받을 수 있음
//		int inputIntgear = scanner.nextInt();
//		System.out.print("입력받은값:");
//		System.out.println(inputIntgear);
		
		System.out.println("");
		String inputString = scanner.nextLine();
		System.out.println("입력받은 문자열:"+inputString);
		                               
		

	}

}
