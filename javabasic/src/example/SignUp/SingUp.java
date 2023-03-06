package example.SignUp;

import java.util.Scanner;

class SignUpDto{ //Data Transfer Object 데이터를 이동 저장을 위한 객체
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
	
} 






public class SingUp {
	// 입력
	// 아이디, 패스워드, 패스워드 확인, 이름
	
	public static void main(String[] args) {
		
		String[] idList = {"qwer", "asdf", "zxcv"}; // <= 다차원 배열이다. Stirng 자체가 이미 문자 배열 이기 때문에 배열에 배열이기 때문. String의 특이성.
		
		
		
		
		
		
	
	// 1. 사용자로부터 아이디, 패스워드, 패스워드 확인, 이름을 입력받음
		Scanner scanner = new Scanner(System.in);
	
		SignUpDto dto = new SignUpDto();
		
		
		System.out.println("아이디: ");
		dto.userId = scanner.nextLine();
		
		System.out.println("패스워드: ");
		dto.userPassword = scanner.nextLine();
		
		System.out.println("패스워드 확인: ");
		dto.userPasswordCheck = scanner.nextLine();
		
		System.out.println("이름: ");
		dto.userName = scanner.nextLine();
		
		// 2. 모두 입력받았는지 검증
		
		// string.isBlank(): 문자열이 비었거나 띄어쓰기만으로 구성됐을 때 
		// true를 반환하고 아니면 false를 반환
		
		if(dto.userId.isBlank()||dto.userPassword.isBlank()||dto.userPasswordCheck.isBlank()||dto.userName.isBlank()) {
			
			System.out.println("모두 입력해주세요");
			return;
			
		}
		
		// 3. 아이디 중복 체크
		//for? while?
		// 3-1 일반 for 문 사용
		for(int index = 0; index<idList.length; index++) {
			if(dto.userId.equals(idList[index])) {
				System.out.println("중복된 아이디가 존재합니다");
				return;
			}
			}
		
		// 3-2)foreach문 사용 <= 얘는 내용을 복사해서 사용. 내용물을 직접 변경할 때에는 for문 사용
		
//		for (String id:idList) {
//			if(userId.equals(id)) {
//				System.out.println("중복된 아이디가 존재합니다");
//				return;
//			}
	
		// 4. 비밀번호 확인
		
		if (!dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호 서로 다릅니다.");
			return;
			
		}
		System.out.println("성공");
	
//}

}
}
//
//결과
//// 성공, 실패(모두 입력하지 않았을 때, 아이디가 중복 될때, 비밀번호가 서로 다를 때




//public static void idcheck() {
//	for(int index = 0; index<idList.length; index++) {
//		if(userId.equals(idList[index])) {
//			System.out.println("중복된 아이디가 존재합니다");
//			return;
//		}
//		
//		
//		
//	}
//	
	
	