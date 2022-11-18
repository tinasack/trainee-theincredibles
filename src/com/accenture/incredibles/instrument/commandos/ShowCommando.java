package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;

public class ShowCommando {
    public void execute(ArrayList<Instrument> myInstrument) {
        for (Instrument instrument : myInstrument) {
            instrument.printInfo();
        }
    }
}
