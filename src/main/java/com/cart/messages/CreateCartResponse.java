package com.cart.messages;

public class CreateCartResponse {
	
	private ResponseHeader respHeader ;
	private CreateCartResponseBody createCartRespBody ;
	
	public ResponseHeader getRespHeader() {
		return respHeader;
	}
	public void setRespHeader(ResponseHeader respHeader) {
		this.respHeader = respHeader;
	}
	public CreateCartResponseBody getCreateCartRespBody() {
		return createCartRespBody;
	}
	public void setCreateCartRespBody(CreateCartResponseBody createCartRespBody) {
		this.createCartRespBody = createCartRespBody;
	} 

}
