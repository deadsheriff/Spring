package com.springtutorial.springidol;

/**
 * Created by Пользователь on 24.11.2016.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;
    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }
    public PoeticJuggler(int beanbags, Poem poem){
        super(beanbags);
        this.poem = poem;
    }

    @Override
    public void Perform() {
        super.Perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
