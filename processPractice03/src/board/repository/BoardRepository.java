package board.repository;

import java.util.ArrayList;
import java.util.List;

import board.entity.Board;
import board.entity.User;

public class BoardRepository {
	public static int index = 0;
	
	private static List<Board> boardTable = new ArrayList<>();
	
	public Board save(Board board) {
		boolean isExist = false;
		
		for(int index = 0; index < boardTable.size(); index++) {
			Board boardItem = boardTable.get(index);
			if(boardItem.getBoardNumber() == board.getBoardNumber()) {
				boardTable.set(index, board);
				isExist = true;
				break;
			}
		}//같은 번호의 게시물이 있을때 덮어 씌움
		
		
		if(!isExist) { 
		boardTable.add(board);
		}
		return board;
	}

public Board findByBoardNumber(int boardNumber) {
	Board result = null;
	for(Board board :boardTable) {
		if(board.getBoardNumber() == boardNumber) {
			result = board;
			break;
		}
	}
	
	return result;
	}
	
	
	public List<Board> findBy(){
		return boardTable;
	}
	
	
	
}
