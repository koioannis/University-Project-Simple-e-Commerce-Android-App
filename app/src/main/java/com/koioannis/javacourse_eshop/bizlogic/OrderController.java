
package com.koioannis.javacourse_eshop.bizlogic;


import com.koioannis.javacourse_eshop.model.Basket;
import com.koioannis.javacourse_eshop.model.Product;
import com.koioannis.javacourse_eshop.model.Shop;
import java.util.ArrayList;
import java.util.List;


public class OrderController {
	private Basket basket;
	private Shop shop;
	private ArrayList<Integer> productsQuantity;
	private ArrayList<Double> productsPrice;

	private static OrderController INSTANCE = new OrderController();

	public static OrderController getInstance() {
		return INSTANCE;
	}

	private OrderController() {
		basket =  new Basket(new ArrayList<Product>());
		shop = AdminController.getInstance().getShop();
		productsQuantity = new ArrayList<>();
		productsQuantity.add(1);
		productsQuantity.add(1);
		productsQuantity.add(1);
		productsQuantity.add(1);
		productsPrice = new ArrayList<>();
		productsPrice.add(0d);
		productsPrice.add(0d);
		productsPrice.add(0d);
		productsPrice.add(0d);

	}

	static void instantiateOrderController(){
		INSTANCE = new OrderController();
	}

	public Basket getBasket(){
		return this.basket;
	}

	public int getProductsCount(){
		List<Product> productsToOrder = basket.getProductsToOrder();
		int count =0;

		for (int i=0; i < productsToOrder.size(); i++){
			count++;
		}

		return count;
	}

	public void addProductQuantity(int index, int quantity){
		productsQuantity.set(index, quantity);
	}

	public int getProductQuantity(int index){
		return productsQuantity.get(index);
	}

	public String getProductName(int index){
		return basket.getProductsToOrder().get(index).getName();
	}

	public double getProductPrice(int index){
		return getInitialProductPrice(index)*getProductQuantity(index);
	}

	public double getInitialProductPrice(int index){
			return Double.parseDouble(basket.getProductsToOrder().get(index).getPrice().toString());
	}


	public void setProductPrice(int index, int quantity){
		productsPrice.set(index, quantity*Double.parseDouble(basket.getProductsToOrder().get(index).getPrice().toString()));
	}

	public void addProduct (int index) {
		basket.addProduct(shop.getExistingProducts().get(index));
	}
}
