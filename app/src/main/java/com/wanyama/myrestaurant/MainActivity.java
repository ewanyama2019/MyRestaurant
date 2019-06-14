package com.wanyama.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mFindRestaurantButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantButton = (Button) findViewById(R.id.findRestaurantButton);
            mFindRestaurantButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                    startActivity(intent);
                }
            });
    }
}
