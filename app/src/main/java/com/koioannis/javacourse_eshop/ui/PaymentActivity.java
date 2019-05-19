package com.koioannis.javacourse_eshop.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.koioannis.javacourse_eshop.R;
import com.koioannis.javacourse_eshop.bizlogic.AdminController;
import com.koioannis.javacourse_eshop.bizlogic.BillingController;

public class PaymentActivity extends AppCompatActivity {
    EditText cardNumber;
    EditText cvv;
    EditText expDate;
    EditText name;
    EditText address;
    EditText email;
    EditText phone;
    EditText postalCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPaymentClick(view);
            }
        });
    }

    public void toCheckoutActivtiy(View view){
        super.onBackPressed();
    }

    public void onPaymentClick(View view){
        fillViews();
        if (isEmpty()){
            Snackbar.make(view, "Please fill the required fields", Snackbar.LENGTH_SHORT)
           .setAction("Action", null).show();
            return;
        }

        BillingController.getInstance().createCustomer(name.getText().toString(), email.getText().toString(),address.getText().toString(),
                postalCode.getText().toString(), phone.getText().toString());



    }

    public boolean isEmpty(){
        if (cardNumber.getText().toString().matches(""))
            return true;
        if (cvv.getText().toString().matches(""))
            return true;
        if (expDate.getText().toString().matches(""))
            return true;
        if (name.getText().toString().matches(""))
            return true;
        if (address.getText().toString().matches(""))
            return true;
        if (email.getText().toString().matches(""))
            return true;
        if (phone.getText().toString().matches(""))
            return true;
        if (postalCode.getText().toString().matches(""))
            return true;

        return false;
    }


    public void fillViews(){
        cardNumber = findViewById(R.id.cardNumber);
        cvv = findViewById(R.id.cardNumber);
        expDate = findViewById(R.id.expDate);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.telephone);
        postalCode = findViewById(R.id.postalCode);
    }


}
