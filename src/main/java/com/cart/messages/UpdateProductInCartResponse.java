package com.cart.messages;

public class UpdateProductInCartResponse {
	
	private ResponseHeader respHeader ;
	private UpdateProductInCartResponseBody updateProdInCartRespBody ;
	
	public ResponseHeader getReqHeader() {
		return respHeader;
	}
	public void setReqHeader(ResponseHeader respHeader) {
		this.respHeader = respHeader;
	}
	public UpdateProductInCartResponseBody getUpdateProdInCartRespBody() {
		return updateProdInCartRespBody;
	}
	public void setUpdateProdInCartRespBody(UpdateProductInCartResponseBody updateProdInCartRespBody) {
		this.updateProdInCartRespBody = updateProdInCartRespBody;
	}

}
