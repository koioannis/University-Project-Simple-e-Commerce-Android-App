package com.koioannis.javacourse_eshop.bizlogic;

import com.koioannis.javacourse_eshop.model.Coupon;

public class BillingController {
    private static final BillingController INSTANCE = new BillingController();
    public static BillingController getInstance () {
        return INSTANCE;
    }
    private double totalPrice;
    private Coupon coupon;

    private BillingController(){
        totalPrice = 0.0;
    }

    public double getTotalPrice(String code){
        OrderController orderController = OrderController.getInstance();
        totalPrice =0;
        for (int i =0; i < orderController.getProductsCount(); i++){
            totalPrice += orderController.getProductPrice(i);
        }

        int discount = AdminController.getInstance().getReduction(code);
        if (discount != -1){
            totalPrice = totalPrice - (totalPrice/100 * discount);
        }

        return totalPrice;
    }
}
