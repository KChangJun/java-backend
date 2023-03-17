package board.dto.request.user;

public class SignInDto {

	private String email;
	private String password;
	
	// constructor------------------------------------
	public SignInDto() {}
	public SignInDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	//----------------------------------------------------
	
	
	//toString--------------------------------------------------------
	@Override
	public String toString() {
		return "SignInDto [email=" + email + ", password=" + password + "]";
	}
	//---------------------------------------
	
	
	//getter setter-----------------------------------------
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//------------------------------------------\

	
	//validate-----------------------------
	public boolean validate() {
		boolean result =
				this.email.isBlank() ||
				this.password.isBlank();
		return result;
	
	}
	
	


}