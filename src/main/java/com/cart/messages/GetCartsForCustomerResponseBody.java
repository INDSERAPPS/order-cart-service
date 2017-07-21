package com.cart.messages;

import java.util.ArrayList;

import com.cart.entity.Cart;

public class GetCartsForCustomerResponseBody {
	
	private String status ;
	private ArrayList<Cart>cartList = new ArrayList<Cart>() ;
	private int errorCode ;
	private String errorDescription ;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(ArrayList<Cart> cartList) {
		this.cartList = cartList;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
