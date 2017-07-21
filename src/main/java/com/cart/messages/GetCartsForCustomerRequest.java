package com.cart.messages;

public class GetCartsForCustomerRequest {
	
	private MessageRequestHeader reqHeader ;
	private String cartMode ;
	private String customerId ;
	
	public MessageRequestHeader getReqHeader() {
		return reqHeader;
	}
	public void setReqHeader(MessageRequestHeader reqHeader) {
		this.reqHeader = reqHeader;
	}
	public String getCartMode() {
		return cartMode;
	}
	public void setCartMode(String cartMode) {
		this.cartMode = cartMode;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
