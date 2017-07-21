package com.cart.messages;

public class AddProductToCartResponse {
	
	private ResponseHeader respHeader ;
	private AddProductToCartResponseBody addProdToCartRespBody ;
	
	public ResponseHeader getRespHeader() {
		return respHeader;
	}
	public void setRespHeader(ResponseHeader respHeader) {
		this.respHeader = respHeader;
	}
	public AddProductToCartResponseBody getAddProdToCartRespBody() {
		return addProdToCartRespBody;
	}
	public void setAddProdToCartRespBody(AddProductToCartResponseBody addProdToCartRespBody) {
		this.addProdToCartRespBody = addProdToCartRespBody;
	}
	
}
