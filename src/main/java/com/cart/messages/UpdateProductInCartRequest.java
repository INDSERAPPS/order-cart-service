package com.cart.messages;

public class UpdateProductInCartRequest {
	
	private MessageRequestHeader reqHeader ;
	private UpdateProductCartRequestBody updateProdCartReqBody ;
	
	public MessageRequestHeader getReqHeader() {
		return reqHeader;
	}
	public void setReqHeader(MessageRequestHeader reqHeader) {
		this.reqHeader = reqHeader;
	}
	public UpdateProductCartRequestBody getUpdateProdCartReqBody() {
		return updateProdCartReqBody;
	}
	public void setUpdateProdCartReqBody(UpdateProductCartRequestBody updateProdCartReqBody) {
		this.updateProdCartReqBody = updateProdCartReqBody;
	}

}
