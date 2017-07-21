package com.cart.messages;

public class GetCartDetailsResponse {
	
	private ResponseHeader respHeader ;
	private GetCartDetailsResponseBody getCartDetailsRespBody ;
	
	public ResponseHeader getRespHeader() {
		return respHeader;
	}
	public void setRespHeader(ResponseHeader respHeader) {
		this.respHeader = respHeader;
	}
	public GetCartDetailsResponseBody getGetCartDetailsRespBody() {
		return getCartDetailsRespBody;
	}
	public void setGetCartDetailsRespBody(GetCartDetailsResponseBody getCartDetailsRespBody) {
		this.getCartDetailsRespBody = getCartDetailsRespBody;
	}

}
