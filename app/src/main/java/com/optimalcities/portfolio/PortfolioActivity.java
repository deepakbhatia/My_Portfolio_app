package com.optimalcities.portfolio;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle(getResources().getString(R.string.app_name));

        //Create Buttons to be able to be click to launch apps
        Button capstone_button =  (Button)findViewById(R.id.capstone);
        Button popular_movies_button =  (Button)findViewById(R.id.popular_movies);
        Button stock_hawk_button =  (Button)findViewById(R.id.stock_hawk);
        Button build_it_bigger_button =  (Button)findViewById(R.id.build_it_bigger);
        Button go_ubiquitous_button =  (Button)findViewById(R.id.go_ubiquitous);
        Button make_app_material_button =  (Button)findViewById(R.id.make_your_app_material);

        //Set up listeners on button to perform action when they are clicked
        popular_movies_button.setOnClickListener(this);
        stock_hawk_button.setOnClickListener(this);
        build_it_bigger_button.setOnClickListener(this);
        go_ubiquitous_button.setOnClickListener(this);
        make_app_material_button.setOnClickListener(this);
        capstone_button.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {

            Intent intent = new Intent(this,AboutActivity.class);

            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        //Get the id of the clicked view(button)
        int view_id = v.getId();
        String toast_message = null;
        Resources res = getResources();

        //Compare the view id and set the appropriate toast message
        switch (view_id)
        {
            case R.id.popular_movies:
               toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.popular_movies));
                break;
            case R.id.stock_hawk:
                toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.stock_hawk));
                break;
            case R.id.build_it_bigger:
                toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.build_it_bigger));
                break;
            case R.id.make_your_app_material:
                toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.make_your_app_material));
                break;
            case R.id.go_ubiquitous:
                toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.go_ubiquitous));
                break;
            case R.id.capstone:
                toast_message = String.format(res.getString(R.string.app_launch_toast_message), res.getString(R.string.capstone));
                break;


        }
        //Create a toast and display it
        Toast.makeText(this,toast_message,Toast.LENGTH_LONG).show();


    }
}
