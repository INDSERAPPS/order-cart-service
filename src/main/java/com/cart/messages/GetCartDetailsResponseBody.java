package com.cart.messages;

import java.util.ArrayList;
import com.cart.entity.CartDetails;

public class GetCartDetailsResponseBody {
	
	private String status ;
	private ArrayList<CartDetails> cartList = new ArrayList<CartDetails>() ;
	private int errorCode ;
	private String errorDescription ;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<CartDetails> getCartList() {
		return cartList;
	}
	public void setCartList(ArrayList<CartDetails> cartList) {
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
