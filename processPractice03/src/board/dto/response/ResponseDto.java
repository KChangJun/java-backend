package board.dto.response;

public class ResponseDto<D> {
	
	private boolean status;
	private String message;
	private D data;
	
	//constructor-----------------------
	public ResponseDto(){}

	public ResponseDto(boolean status, String message, D data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	//------------------------------------

	
	
	//getter setter ----------------------
	public boolean isStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public D getData() {
		return data;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(D data) {
		this.data = data;
	}
	//---------------------------------------

	
	
	
	//toString------------------------------------
	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	//---------------------------------------------
	
	
	
	
	
	
	
	
	
	
}
