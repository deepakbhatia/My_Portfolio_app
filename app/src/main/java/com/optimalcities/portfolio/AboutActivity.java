package com.optimalcities.portfolio;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        TextView about_text = (TextView)findViewById(R.id.image_licence);

        about_text.setText(getResources().getString(R.string.licence_image));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int view_id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (view_id) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }



        return super.onOptionsItemSelected(item);
    }

}
