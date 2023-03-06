package example.SignIn;


// 로그인 프로세스 구현

import java.util.Scanner;
public class SingIn {

	
	// 입력
	// 아이디, 비밀번호

	
	// 결과
	// 성공, 실패(모두 입력하지 않았을 때, 정보가 일치하지 않을 때)
	
	
	public static void main(String[] args) {
		// 1. 사용자로 부터 아이디와 패스워드 입력받음
		Scanner scanner = new Scanner(System.in);
			final String ID = "qwer1234"; //final로 상수를 정할떄 변수명은 무조건 대문자
			final String PW = "1234qwer";
		
		System.out.println("아이디와 비밀번호를 입력하세요.");
		String userId = new String();
		String userPw = new String();
		
		userId = scanner.nextLine();
		userPw = scanner.nextLine();
		
		// 2. 사용자가 모두 내용을 입력했는지 검증
		// userId, userPw 변수가 비었는지 확인
		// 문자열에서 값이 비엇는지 확인하는 기능(메서드)가 존재
		// string.isEmpty(): 비었으면 true 아니면 false
		
//		if (userId.x.isEmpty()||userPw.x.isEmpty()) {
//			System.out.println("모두 입력하세요.");
//			return;			
//		}
		
		
		if(userId.isEmpty()||userPw.isEmpty()) {
			System.out.println("모두 입력해주세요");
			return;
			
	
		}
		
		
		//3. 사용자 입력값과 저장된 갓이 같은지 검증
		//검증한다 = if 를 써라
		// string.equals(비교대상) : 같으면 true, 아니면 false
		
		if(!userId.equals(ID)||!userPw.equals(PW)) {
			// 같으면 true =>false  ||= true가 하나라도 있으면 true  같으면 true =>false
			//
			
			
			//!(userId.equals(ID)&&userPw.equals(PW))
			System.out.println("로그인 정보가 일치하지 않습니다");
			return;
			
			
		}
		System.out.println("로그인 되었습니다");
		
		
	}

}







