package com.koioannis.javacourse_eshop.ui;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import com.koioannis.javacourse_eshop.R;
import com.koioannis.javacourse_eshop.bizlogic.BillingController;
import com.koioannis.javacourse_eshop.bizlogic.OrderController;
import java.text.DecimalFormat;


public class ActivityCheckout extends AppCompatActivity {
    private OrderController orderController;
    private BillingController billingController;
    private TextView totalCost;
    private TextView coupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decor = getWindow().getDecorView();
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        totalCost = findViewById(R.id.totalCost);
        displayProducts();

    }

    private void displayProducts(){
        orderController = OrderController.getInstance();
        billingController = BillingController.getInstance();
        int productsCount = orderController.getProductsCount();
        for (int i=0; i < productsCount; i++){
                ConstraintLayout layout = (ConstraintLayout) findViewByString("constraintLayout", i);
                View line = findViewByString("line", i);

                totalCost.setText("€" + billingController.getTotalPrice("-1"));
                totalCost.setAlpha(1f);
                TextView productName = (TextView) layout.getChildAt(0);
                TextView productPrice = (TextView) layout.getChildAt(1);
                TextView quantityTextView = (TextView) layout.getChildAt(3);
                quantityTextView.setText(Integer.toString(orderController.getProductQuantity(i)));
                productName.setTextSize(18);
                productName.setText(orderController.getProductName(i));
                productPrice.setTextSize(18);
                productPrice.setText(orderController.getProductPrice(i) + "€");
                line.setAlpha(0.1f);
                layout.setAlpha(1f);
        }
    }

    protected void toMainActivity(View view){
          super.onBackPressed();
    }

    protected void addQuantity(View view){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        if (changeProductQuantity(true, view)) {
            changePrice(true, view);
            totalCost.setText("€" + decimalFormat.format(billingController.getTotalPrice("-1")));
        }

    }

    protected void removeQuantity(View view){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        if (changeProductQuantity(false, view)) {
            changePrice(false, view);
            totalCost.setText("€" + decimalFormat.format(billingController.getTotalPrice("-1")));
        }

    }

    private void changePrice(Boolean isAdd, View view){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        orderController = OrderController.getInstance();
        int tag = Integer.parseInt(view.getTag().toString());
        TextView priceTextView = (TextView)findViewByString("productPrice", tag);

        String str = priceTextView.getText().toString();
        double price = Double.parseDouble(str.substring(0, str.indexOf("€")));
        String finalPrice = "";

        if (isAdd)
            finalPrice = decimalFormat.format(price + orderController.getInitialProductPrice(tag)) + "€";
        if (!isAdd)
            finalPrice = decimalFormat.format(price - orderController.getInitialProductPrice(tag)) + "€";

        priceTextView.setText(finalPrice);
    }

    private boolean changeProductQuantity(Boolean isAdd, View view){
        int tag = Integer.parseInt(view.getTag().toString());
        TextView quantity = (TextView)findViewByString("productQuantity" , tag);
        orderController = OrderController.getInstance();

        int productQuantity = Integer.parseInt(quantity.getText().toString());

        if (productQuantity == 9 && isAdd)
            return false;

        if (productQuantity == 0 && !isAdd) {
            return false;
        }

        if (isAdd) {
            productQuantity++;
            orderController.addProductQuantity(tag, productQuantity);
            orderController.setProductPrice(tag, productQuantity);
        } else {
            productQuantity--;
            orderController.addProductQuantity(tag, productQuantity);
        }
        changeQuantityTextview(quantity, productQuantity);
        return true;
    }

    private void changeQuantityTextview(TextView quantity, int productQuantity){
        quantity.setText(Integer.toString(productQuantity));
    }

    private View findViewByString(String type, int tag) {
        String productQuantityID = type + tag;
        Resources res = getResources();
        int id = res.getIdentifier(productQuantityID, "id", getApplicationContext().getPackageName());

        return findViewById(id);
    }



}
