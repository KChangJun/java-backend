package board.repository;

import java.util.ArrayList;
import java.util.List;

import board.entity.User;

public class UserRepository {
	
	private static List<User> userTable = new ArrayList<>();
	
	
	
	//로그인용 email 확인 
	public User findByEmail(String email) {
		User result = null;
		for(User user: userTable) {
			if(user.getEmail().equals(email)) {
				result = user;
				break;
			}
		}
		return result;
	} 
	//--------------------------------------
	
	
	//email 검증---------------------------------------------
	public boolean existByEmail(String email) {
		boolean result = false;
		for(User user : userTable) {
			if(email.equals(user.getEmail())){
				result = true;
				break;
			}
		}
		
		return result;
	}
	//-----------------------------------------------
	
	
	//save-------------------
	public User save(User user) {
		userTable.add(user);
		return user;
	}
	//-----------------------------------------
	
	
}
