package com.koioannis.javacourse_eshop.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.koioannis.javacourse_eshop.R;

public class ActivityCheckout extends AppCompatActivity {

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
    }

    protected void toMainActivity(View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);

    }

    protected void addQuantity(View view){

        if (changeProductQuantity(true, view))
            changePrice(true, view);

    }

    protected void removeQuantity(View view){
        if (changeProductQuantity(false, view))
            changePrice(false, view);


    }

    private void changePrice(Boolean isAdd, View view){
        TextView priceTextView = findViewByString("productPrice", Integer.parseInt(view.getTag().toString()));
        String str = priceTextView.getText().toString();
        int price = Integer.parseInt(str.substring(0, str.indexOf("€")));
        String finalPrice = "";

        if (isAdd)
            finalPrice = price * 2 + "€";
        if (!isAdd)
            finalPrice = price / 2 + "€";

        priceTextView.setText(finalPrice);
    }


    private boolean changeProductQuantity(Boolean isAdd, View view){
        TextView quantity = findViewByString("productQuantity" , Integer.parseInt(view.getTag().toString()));

        int productQuantity = Integer.parseInt(quantity.getText().toString());

        if (productQuantity == 9 && isAdd)
            return false;

        if (productQuantity == 0 && !isAdd) {
            return false;
        }

        if (isAdd)
            productQuantity++;
        else
            productQuantity--;

        changeQuantityTextview(quantity, productQuantity);
        return true;
    }

    private void changeQuantityTextview(TextView quantity, int productQuantity){
        quantity.setText(Integer.toString(productQuantity));

    }

    private TextView findViewByString(String type, int tag) {
        String productQuantityID = type + tag;
        Resources res = getResources();
        int id = res.getIdentifier(productQuantityID, "id", getApplicationContext().getPackageName());

        return findViewById(id);
    }



}
