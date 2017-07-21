package com.cart.messages;

public class CreateCartRequest {
	
	private MessageRequestHeader reqHeader ;
	private CreateCartRequestBody createReqBody ;

	public MessageRequestHeader getReqHeader() {
		return reqHeader;
	}
	public void setReqHeader(MessageRequestHeader reqHeader) {
		this.reqHeader = reqHeader;
	}
	public CreateCartRequestBody getCreateReqBody() {
		return createReqBody;
	}
	public void setCreateReqBody(CreateCartRequestBody createReqBody) {
		this.createReqBody = createReqBody;
	}

}
