package board;

//순서도 3개 (c java javascript)
// 예외사항 

//객체의 특징 , 객체 5원칙
// 간단한 스크립트


import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;

public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	private static final String SIGN_UP="POST /sign-up";
	private static final String SIGN_IN="POST /sign-in";
	private static final String POST_BOARD="POST /board"; 
	private static final String GET_BOARD="GET /board";
	private static final String GET_BOARD_LIST="GET /board/list";
	
	private static final String PATCH_BOARD ="PATCH /board"; //덮어 씌우다
	private static final String DELETE_BOARD ="DELETE /board";
	
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
				
				
				//case 02------------------------------------------				
			case POST_BOARD:
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.print("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 :");
				postBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 :");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 :");
				postBoardDto.setWriterEmail(scanner.nextLine());
				
				boardController.postBoard(postBoardDto);
				break;
				//case 02-------------------------------------------
				
				
				
				//case 03---------------------------------------------
			case GET_BOARD:
				int boardNumber = 0; // 선언하고 초기화 해주자
				
				try {
					System.out.print("게시물 번호 : ");
					boardNumber = scanner.nextInt();//외부에서 입력받을때는 늘 예외처리를 해주어야함. 특히나 String 로 받을때가 아닌 특정 자료형으로 받을때에는 더 조심해야함
					scanner.nextLine();
				
				}catch(Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber);
				
				break;
				//case 03---------------------------------------------
			
			
				//case 04--------------------------------------------
			case GET_BOARD_LIST:	
				
				boardController.getBoardList();
				
				
				
				
				break;
				//case 04---------------------------------------------
				
				//case 05----------------------------------------------
			case PATCH_BOARD:
//				patchboard();
				PatchBoardDto patchBoardDto= new PatchBoardDto();
				try {
				System.out.print("게시불 번호: ");
				String patchBoardNumber = scanner.nextLine();
				patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));//parseInt = 인트타입 자료형으로 바꿔줌, 정수형이 들어오지 않았을 경우 에러가 발생할수 있음
				System.out.print("제목 : ");
				patchBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 :");
				patchBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 :");
				patchBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 :");
				patchBoardDto.setEmail(scanner.nextLine());
				}catch(Exception exceptrion) {
					exceptrion.printStackTrace();
					continue;
				}
				
				
				boardController.patchBoard(patchBoardDto);
//				
				break;
				//case 05--------------------------------------------------
			
				
				
				//case 06-----------------------------------------------------
			case DELETE_BOARD:
				int deleteBoardNumber = 0;
				String deleteEmail=null;
				try {
						System.out.print("게시불 번호: ");
						deleteBoardNumber = Integer.parseInt(scanner.nextLine());
						System.out.print("이메일 주소 :");		
						deleteEmail = scanner.nextLine();
						
				} catch(Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.deleteBoard(deleteBoardNumber, deleteEmail);
				break;
				//case06----------------------------------------------
				
				
				
				
				//default-------------------------------------
			default:
					System.out.println(HttpStatus.NOT_FOUND);
				//default-------------------------------------
				
				
				
			
					
					
			}//switch 00

			
			
		}//while00
		
		
	
	}
	
	
//	private static void patchboard() {
//		Scanner scanner = new Scanner(System.in);
//		PatchBoardDto patchBoardDto= new PatchBoardDto();
//	try {
//		
//	System.out.print("게시불 번호: ");
//	String patchBoardNumber = scanner.nextLine();
//	patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));//parseInt = 인트타입 자료형으로 바꿔줌, 정수형이 들어오지 않았을 경우 에러가 발생할수 있음
//	System.out.print("제목 : ");
//	patchBoardDto.setTitle(scanner.nextLine());
//	System.out.print("내용 :");
//	patchBoardDto.setContent(scanner.nextLine());
//	System.out.print("이미지 :");
//	patchBoardDto.setBoardImageUrl(scanner.nextLine());
//	System.out.print("작성자 이메일 :");
//	patchBoardDto.setEmail(scanner.nextLine());
//	boardController.patchBoard(patchBoardDto);
//	}catch(Exception exceptrion) {
//		exceptrion.printStackTrace();
//	}
//	
//	}
//	
//	
//	
	
	

}
