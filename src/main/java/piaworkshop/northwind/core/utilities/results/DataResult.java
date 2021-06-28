package piaworkshop.northwind.core.utilities.results;

public class DataResult<T> {
	
	private String message;
	private boolean success;
	private T data;
	
	
	public DataResult(String message, boolean success, T data) {
		super();
		this.message = message;
		this.success = success;
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public T getData() {
		return this.data;
	}

}
