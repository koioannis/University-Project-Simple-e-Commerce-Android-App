package com.koioannis.javacourse_eshop.ui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.koioannis.javacourse_eshop.R;
import com.koioannis.javacourse_eshop.bizlogic.BillingController;
import com.koioannis.javacourse_eshop.bizlogic.OrderController;


public class InvoiceActivity extends AppCompatActivity {

    BillingController billingController;
    OrderController orderController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        orderController = OrderController.getInstance();
        billingController = BillingController.getInstance();
        fillCustomerInfo();
        fillProducts();

        FloatingActionButton invoiceBtn = findViewById(R.id.invoiceFab);
        invoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
               Intent startActivity = new Intent(getApplicationContext(), MainActivity.class);
               startActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
               startActivity(startActivity);

            }
        });
    }

    private void fillCustomerInfo() {
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView address = findViewById(R.id.address);
        TextView postalCode = findViewById(R.id.postalCode);

        name.setText(billingController.getCustomer().getName());
        email.setText(billingController.getCustomer().getEmail());
        phone.setText(billingController.getCustomer().getPhone());
        address.setText(billingController.getCustomer().getAddress());
        postalCode.setText(billingController.getCustomer().getPostalCode());
    }

    private void fillProducts(){
        LinearLayout invoiceProducts = findViewById(R.id.invoice_products);
        for (int i=0; i < orderController.getProductsCount(); i++){

            LinearLayout invoiceProduct = (LinearLayout) getLayoutInflater().inflate(R.layout.invoice_product, null);

            TextView productName = (TextView)invoiceProduct.getChildAt(0);
            productName.setText(orderController.getProductName(i));

            TextView productQuantity = (TextView)invoiceProduct.getChildAt(1);
            productQuantity.setText("x" + Integer.toString(orderController.getProductQuantity(i)));

            TextView productPrice = (TextView)invoiceProduct.getChildAt(2);
            productPrice.setText(Double.toString(orderController.getInitialProductPrice(i)));

            invoiceProducts.addView(invoiceProduct);
        }
    }
}
