package com.example.osk_and.app.framework;

import android.graphics.Canvas;

/**
 * Created by keisuke on 2014/05/25.
 */

public interface Scene {

  public void init(GameView view);
  public void start(GameView view);
  public void process(GameView view);
  public void draw(Canvas canvas);

}

