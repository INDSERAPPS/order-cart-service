package com.cart.messages;

public class AddProductToCartRequest {
	
	private MessageRequestHeader reqHeader ;
	private AddProductToCartRequestBody addProdToCartReqBody ;
	
	public MessageRequestHeader getReqHeader() {
		return reqHeader;
	}
	public void setReqHeader(MessageRequestHeader reqHeader) {
		this.reqHeader = reqHeader;
	}
	public AddProductToCartRequestBody getAddProdToCartReqBody() {
		return addProdToCartReqBody;
	}
	public void setAddProdToCartReqBody(AddProductToCartRequestBody addProdToCartReqBody) {
		this.addProdToCartReqBody = addProdToCartReqBody;
	}

}
