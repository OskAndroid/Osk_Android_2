package com.example.osk_and;

import android.app.Activity;
import android.content.Intent;import android.os.Bundle;import android.view.View;import android.widget.Button;

/**
 * Created by keisuke on 2014/05/26.
 */
public class TitleActivity extends Activity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        ((Button)findViewById(R.id.start)).setOnClickListener(this);
        ((Button)findViewById(R.id.exit)).setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.equals(findViewById(R.id.start))) {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }

        if(v.equals(findViewById(R.id.exit))) {
            finish();
        }

    }
}
