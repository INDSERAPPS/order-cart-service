package com.cart.messages;

public class UpdateProductInCartResponseBody {
	
	private String status ;
	private int cartItemCounter ;
	private int errorCode ;
	private String errorDescription ;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCartItemCounter() {
		return cartItemCounter;
	}
	public void setCartItemCounter(int cartItemCounter) {
		this.cartItemCounter = cartItemCounter;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	

}
