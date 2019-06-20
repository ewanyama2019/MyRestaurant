package com.wanyama.myrestaurant;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;
import butterknife.ButterKnife;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findRestaurantButton) Button mFindRestaurantButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;
//    private Button mFindRestaurantButton;
//    private EditText mLocationEditText;
//    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        mAppNameTextView= (TextView) findViewById(R.id.appNameTextView);
        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);
//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
//        mFindRestaurantButton = (Button) findViewById(R.id.findRestaurantButton);
        mFindRestaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
            });
    }
}
