package com.example.osk_and.app.framework;

/**
 * Created by keisuke on 2014/05/25.
 */
public abstract class Scenes {
    private final List<Scene> scenes;

    protected Scenes() {
        scenes = new ArrayList<Scene>();
        appendAll(scenes);
    }

    protected abstract void appendAll(List<Scene> cotainer);
}
