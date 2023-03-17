package board.service;

import javax.swing.RepaintManager;

import board.common.constant.ResponseMessage;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.dto.response.ResponseDto;
import board.dto.response.user.SignInResponseDto;
import board.entity.User;
import board.repository.UserRepository;

public class UserService {

	private UserRepository userRepository;
	
	public UserService() {//생성자로 부르면 userReository 인스턴스도 생성 시켜 버림
		userRepository = new UserRepository();
	}
	
	//signUp----------------------------------
	public ResponseDto<Boolean> signUp(SignUpDto dto) {
		
		String email = dto.getEmail();
		String password = dto.getPassword();
		String passwordCheck = dto.getPasswordCheck();
		
		boolean hasEmail =userRepository.existByEmail(email);
		
		if(hasEmail) {
			return new ResponseDto<Boolean>(false, ResponseMessage.EXIST_EMAIL, false);
		}
		
		if(!password.equals(passwordCheck)) {
			return new ResponseDto<Boolean>(false, ResponseMessage.PASSWORD_NOT_MATCH, false);
		}
		
		
		
		User user=new User(dto);
		userRepository.save(user);
		
		
		
		return new ResponseDto<Boolean>(true, ResponseMessage.SUCCESS, true);
	}
	//---------------------------------------------------
	
	//signIn-----------------------------------------
	public ResponseDto<SignInResponseDto> signIn(SignInDto dto) {
		
		SignInResponseDto data = null;
		
		String email = dto.getEmail();
		String password = dto.getPassword();
		 
		User user = userRepository.findByEmail(email);
		if(user == null) {
			return new ResponseDto<>(false,ResponseMessage.FAIL_SIGN_IN,null);
		}
		boolean isEqualPassword = user.getPassword().equals(password);
		if(!isEqualPassword) {
			return new ResponseDto<>(false,ResponseMessage.FAIL_SIGN_IN,null);
		}
		
		data = new SignInResponseDto(user);
		
		return new ResponseDto<SignInResponseDto>(true,ResponseMessage.SUCCESS,data);
	}
	//--------------------------------------------------------------------------
}
