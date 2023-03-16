package board.entity;

public class Like {

	private String userEmail;
	private String userProfileImageUrl;
	private String userNickname;

	
	//constructor-----------------------------------------------------------------------
	public Like() {}
	public Like(String userEmail, String userProfileImageUrl, String userNickname) {
		super();
		this.userEmail = userEmail;
		this.userProfileImageUrl = userProfileImageUrl;
		this.userNickname = userNickname;
	}
	//--------------------------------------------------------------
	
	
	//getter setter------------------------------------------------
	public String getUserEmail() {
		return userEmail;
	}
	public String getUserProfileImageUrl() {
		return userProfileImageUrl;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setUserProfileImageUrl(String userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	//---------------------------------------------------------------

	
	
	//tostring-----------------------------------------------------------
	@Override
	public String toString() {
		return "Like [userEmail=" + userEmail + ", userProfileImageUrl=" + userProfileImageUrl + ", userNickname="
				+ userNickname + "]";
	}
	//-------------------------------------------------------------






}
