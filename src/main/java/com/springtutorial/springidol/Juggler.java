package com.springtutorial.springidol;

public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void Perform(){
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

}
