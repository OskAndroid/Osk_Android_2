package com.example.osk_and;

import android.os.Bundle;import android.support.v7.app.ActionBarActivity;import android.view.Menu;import android.view.MenuItem;

/**
 * Created by keisuke on 2014/05/26.
 */
public class TitleActivity extends ActionBarActivity  {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.title_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.finish) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    }


