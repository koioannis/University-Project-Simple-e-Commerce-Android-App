package com.koioannis.javacourse_eshop.ui;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.koioannis.javacourse_eshop.R;

public class InvoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        fillCustomerInfo();

        FloatingActionButton invoiceBtn = findViewById(R.id.invoiceFab);
        invoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
            }
        });
    }

    private void fillCustomerInfo() {
        
    }
}
