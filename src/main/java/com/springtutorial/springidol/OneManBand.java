package com.springtutorial.springidol;

import java.util.Collection;

/**
 * Created by Пользователь on 24.11.2016.
 */
public class OneManBand implements Performer {

    public void Perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}
