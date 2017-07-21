package com.cart.entity;

public class CartDetails {
	
	private String cartDetailId ;
	private String cartId ;
	private String productId;
	private int quantity ;
	private long orderPrice ;
	
	public String getCartDetailId() {
		return cartDetailId;
	}
	public void setCartDetailId(String cartDetailId) {
		this.cartDetailId = cartDetailId;
	}
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
	public long getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(long orderPrice) {
		this.orderPrice = orderPrice;
	}

}
