package com.example.osk_and;

import android.app.Activity;
import android.content.Intent;import android.os.Bundle;import android.view.View;import android.widget.Button;

/**
 * Created by keisuke on 2014/05/26.
 */
public class TitleActivity extends Activity implements View.OnClickListener {
        Button start;
        Button exit;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        start = (Button)findViewById(R.id.start);
        exit = (Button)findViewById(R.id.exit);

        (start).setOnClickListener(this);
        (exit).setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.equals(start)) {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }

        if(v.equals(exit)) {
            finish();
        }

    }
}
