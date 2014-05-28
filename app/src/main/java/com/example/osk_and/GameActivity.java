package com.example.osk_and;

import android.app.Activity;import android.os.Bundle;import android.view.View;import android.widget.Button;

/**
 * Created by keisuke on 2014/05/26.
 */

public class GameActivity extends Activity implements View.OnClickListener{
    Button title;
    Button exit;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (Button)findViewById(R.id.title);

        (title).setOnClickListener(this);

    }

    public void onClick(View v) {
        if(v.equals(title))
            finish();
    }
}
