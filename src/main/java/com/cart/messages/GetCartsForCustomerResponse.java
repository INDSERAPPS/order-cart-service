package com.cart.messages;

public class GetCartsForCustomerResponse {
	
	private ResponseHeader respHeader ;
	private GetCartsForCustomerResponseBody getCartsForCustRepBody ;
	
	public ResponseHeader getRespHeader() {
		return respHeader;
	}
	public void setRespHeader(ResponseHeader respHeader) {
		this.respHeader = respHeader;
	}
	public GetCartsForCustomerResponseBody getGetCartsForCustRepBody() {
		return getCartsForCustRepBody;
	}
	public void setGetCartsForCustRepBody(GetCartsForCustomerResponseBody getCartsForCustRepBody) {
		this.getCartsForCustRepBody = getCartsForCustRepBody;
	}

}
