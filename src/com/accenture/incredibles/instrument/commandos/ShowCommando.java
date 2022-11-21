package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowCommando implements Commando {
    private ArrayList<Instrument> instruments;
    private Scanner scanner;

    public ShowCommando(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
        this.scanner = scanner;
    }
    public boolean execute() {
        for (Instrument instrument : instruments) {
            instrument.printInfo();
        }
        return true;
    }

    public boolean run(String command) {
        return  "show".equals(command);
    }
}
