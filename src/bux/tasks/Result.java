package bux.tasks;

public class Result<T> {

	public static Result<Object> SUCCESS_RESULT = new Result<>(true, null);

	private boolean success;
	private T data;

	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
