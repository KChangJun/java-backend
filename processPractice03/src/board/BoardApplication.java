package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;

public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	private static final String SIGN_UP="POST /sign-up";
	private static final String SIGN_IN="POST /sign-in";
	
	
	public static void main(String[] args) {
		
		while(true) { //while00
			Scanner scanner = new Scanner(System.in);
			System.out.print("URL End point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {//switch00
			
			
			case SIGN_UP: //case 00---------------------------
				SignUpDto signUpDto=new SignUpDto();
				
				System.out.print("이메일 주소 : ");
				signUpDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signUpDto.setPassword(scanner.nextLine());
				System.out.print("비밀번호 확인: ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				System.out.print("닉네임 : ");
				signUpDto.setNickname(scanner.nextLine());
				System.out.print("휴대전화 번호 : ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				System.out.print("주소 : ");
				signUpDto.setAddress(scanner.nextLine());
				System.out.print("상세주소 : ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
				//System.out.println(dto.toString());
				
				userController.signUp(signUpDto);
				break;
				//case 00---------------------------------------
				
				
				//case 01---------------------------------------
				
			case SIGN_IN:	
				SignInDto signInDto = new SignInDto();
				System.out.print("이메일 주소 :");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 :");
				signInDto.setPassword(scanner.nextLine());
				
				
				//System.out.println(signInDto.toString()); 입력화긴
				
				userController.signIn(signInDto);
				break;
				
				
				//case 01------------------------------------------
				
				
				
				

			
				//default-------------------------------------
			default:
					System.out.println(HttpStatus.NOT_FOUND);
				//default-------------------------------------
				
				
				
			
					
					
			}//switch 00

			
			
		}//while00
		
		
	
	}

}
