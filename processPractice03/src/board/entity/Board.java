package board.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.repository.BoardRepository;

public class Board {
	
	private int boardNumber;
	private String boardImageUrl;
	private String writerEmail;
	private String writeNickname;
	private String writerProfileImageUrl;
	private String writeDate;
	private String title;
	private String content;
	private int viewCount;
	private List<Like> likeList;
	private List<Comment> commentList;
	//constructor ----------------------------------------
	public Board() {}

	public Board(int boardNumber, String boardImageUrl, String writerEmail, String writeNickname,
			String writerProfileImageUrl, String writeDate, String title, String content, int viewCount,
			List<Like> likeList, List<Comment> commentList) {
		super();
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.writerEmail = writerEmail;
		this.writeNickname = writeNickname;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.likeList = likeList;
		this.commentList = commentList;
	}
	
	public Board(PostBoardDto dto, User user) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		this.boardNumber = ++BoardRepository.index;
		this.boardImageUrl = dto.getBoardImageUrl();
		this.writerEmail = user.getEmail();
		this.writeNickname = user.getNickname();
		this.writerProfileImageUrl = user.getProfileImageUrl();
		this.writeDate = simpleDateFormat.format(now);//현재시간 넣는법
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.viewCount = 0;
		this.likeList = new ArrayList<>();
		this.commentList = new ArrayList<>();
	}
	
	
	
	
	
	
	
	//----------------------------------------------------------

	
	//getter setter ----------------------------------------------------------------
	public int getBoardNumber() {
		return boardNumber;
	}
	public String getBoardImageUrl() {
		return boardImageUrl;
	}
	public String getWriterEmail() {
		return writerEmail;
	}
	public String getWriteNickname() {
		return writeNickname;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public void setWriteNickname(String writeNickname) {
		this.writeNickname = writeNickname;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public int getViewCount() {
		return viewCount;
	}
	public List<Like> getLikeList() {
		return likeList;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}
	public void setWriterEmail(String writerEmail) {
		this.writerEmail = writerEmail;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	//-----------------------------------------------------------------
	
	
	
	//toString--------------------------------------------------------
	@Override
	public String toString() {
		return "Board [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl + ", writerEmail=" + writerEmail
				+ ", writeNickname=" + writeNickname + ", writerProfileImageUrl=" + writerProfileImageUrl
				+ ", writeDate=" + writeDate + ", title=" + title + ", content=" + content + ", viewCount=" + viewCount
				+ ", likeList=" + likeList + ", commentList=" + commentList + "]";
	}
	
	//--------------------------------------------------
	
	public void increaseViewCount() {
			this.viewCount++;
	}
	
	public void patch(PatchBoardDto dto) {
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.boardImageUrl = dto.getBoardImageUrl();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
