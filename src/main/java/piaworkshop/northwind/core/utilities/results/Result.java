package piaworkshop.northwind.core.utilities.results;

public class Result {

	private String message;
	private boolean success;
	
	public Result(String message,boolean success) {
		this.message = message;
		this.success = success;
	}
	
	public Result(String message) {
		this.message = message;
	}
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
}
