package com.cart.messages;

public class UpdateProductCartRequestBody {
	
	private String cartId ;
	private String productId ;
	private int quantity ;
	private Amount orderPrice ;
	private String isActive ;
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Amount getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Amount orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
