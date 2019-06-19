package com.wanyama.myrestaurant;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

public class RestaurantsActivity extends AppCompatActivity {

    private TextView mLocationTextView;
    private ListView mListView;

    private String[] restaurants = new String[] {"Mangrove", "Big Square - Wilson",
            "Vibro", "Nixen Entertainment", "Thorntree", "Chicken World Kenya",
            "The Shack Nairobi", "Radisson Blue", "Veggie Veg", "Olive Resort",
            "Maritas Bhajias", "Sikia Fine Dining", "Greenrose",
            "KPM Nyama Choma", "Fish Grill"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mListView =(ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(RestaurantsActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
