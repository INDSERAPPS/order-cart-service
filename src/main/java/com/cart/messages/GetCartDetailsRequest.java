package com.cart.messages;

public class GetCartDetailsRequest {
	
	private MessageRequestHeader reqHeader ;
	private String cartMode ;
	private String cartId ;
	
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
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

}
