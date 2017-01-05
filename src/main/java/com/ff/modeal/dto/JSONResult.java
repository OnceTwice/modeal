package com.ff.modeal.dto;

public class JSONResult {

	private String result;  // "success" or "fail"
	private String message; // result가 "fail" 일 때  원인
	private Object data;    // result가 "succes" 일 때  전달해야 할 데이터 객체

	public static JSONResult error( String message ) {
		return new JSONResult( false, null, message );
	}
	
	public static JSONResult success( Object data ) {
		return new JSONResult( true, data, null );
	}
	
	private JSONResult() {
	}

	private JSONResult( boolean isSuccess, Object data, String message ) {
		result = isSuccess ? "success" : "fail";
		this.data = data;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}
}
