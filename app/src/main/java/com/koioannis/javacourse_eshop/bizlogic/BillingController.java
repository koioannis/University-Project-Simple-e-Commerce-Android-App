package com.koioannis.javacourse_eshop.bizlogic;

import com.koioannis.javacourse_eshop.model.Coupon;
import com.koioannis.javacourse_eshop.model.Customer;

import java.text.DecimalFormat;

public class BillingController {
    private static final BillingController INSTANCE = new BillingController();
    public static BillingController getInstance () {
        return INSTANCE;
    }
    private double totalPrice;
    private Coupon coupon;
    private Customer customer;

    private BillingController(){
        totalPrice = 0.0;
    }

    public double getTotalPrice(String code){
        OrderController orderController = OrderController.getInstance();
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        totalPrice =0;
        for (int i =0; i < orderController.getProductsCount(); i++){
            totalPrice += orderController.getProductPrice(i);
        }

        int discount = AdminController.getInstance().getReduction(code);
        if (discount != -1){
            totalPrice = totalPrice - (totalPrice/100 * discount);
        }

        return Double.parseDouble(decimalFormat.format(totalPrice));
    }

    public void createCustomer(String name, String email, String address, String postalCode, String telephone){
        customer = new Customer(name, email, address, postalCode, telephone);
    }
}
