package com.koioannis.javacourse_eshop.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.koioannis.javacourse_eshop.R;
import com.koioannis.javacourse_eshop.bizlogic.AdminController;
import com.koioannis.javacourse_eshop.bizlogic.OrderController;

public class MainActivity extends AppCompatActivity {
    AdminController adminController;
    OrderController orderController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decor = getWindow().getDecorView();
            decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        FloatingActionButton fab = findViewById(R.id.mainActivityFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent checkoutActivity = new Intent(MainActivity.this, CheckoutActivity.class);
                MainActivity.this.startActivity(checkoutActivity);
            }
        });
        adminController = AdminController.getInstance();
        orderController = OrderController.getInstance();

    }

    protected void addBasket(View view){
        int tag = Integer.parseInt(view.getTag().toString());
        orderController.addProduct(tag);
        view.setBackgroundResource(R.drawable.ic_done);
    }


}
