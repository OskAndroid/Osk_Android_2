package com.example.osk_and.app.framework;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window; /**
 * Created by keisuke on 2014/05/25.
 */

public class GameActivity extends Activity {

    protected abstract Scenes scenes();

    @override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView();


    }
}
