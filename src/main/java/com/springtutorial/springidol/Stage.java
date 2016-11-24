package com.springtutorial.springidol;

/**
 * Created by Пользователь on 24.11.2016.
 */
public class Stage {
    private Stage() {
    }
    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }
    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
