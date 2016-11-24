package com.springtutorial.springidol;

public class Sonnet implements Poem {
    private static String[] LINES = {"123","321","456","987"};

    public void recite() {
        for(String line : LINES){
            System.out.println(line);
        }
    }
}
