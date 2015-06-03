package com.kbrtz.picassoexaple;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class MainActivity extends ActionBarActivity {

    ImageView firstImage, secondImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstImage = (ImageView) findViewById(R.id.first_image);
        secondImage = (ImageView) findViewById(R.id.second_image);

        Picasso.with(MainActivity.this)
                .load("https://static1.squarespace.com/static/55008a2fe4b09e5e0b138511/556b3799e4b06d83cf7ed396/556b3806e4b0732142cd0459/1433090055422/pizza.jpg?format=750w&storage=local")
                .placeholder(getApplicationContext().getResources().getDrawable(android.R.drawable.btn_star))
                .into(firstImage);
        Picasso.with(MainActivity.this)
                .load("https://static1.squarespace.com/static/55008a2fe4b09e5e0b138511/556b3799e4b06d83cf7ed396/556b3807e4b014bf4340cf8f/1433090056087/youtube.jpg?format=750w&storage=local")
                .placeholder(getApplicationContext().getResources().getDrawable(android.R.drawable.btn_star))
                .resize(120,70)
                .into(secondImage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
