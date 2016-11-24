package com.springtutorial.springidol;



/**
 * Created by Пользователь on 24.11.2016.
 */
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }
    //Two properties
    private Instrument instrument;
    private String song;

    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void Perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}