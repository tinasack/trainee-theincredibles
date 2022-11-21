package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCommando implements Commando {
    private ArrayList<Instrument> instruments;
    private Scanner scanner;

    public RemoveCommando(ArrayList<Instrument> instruments, Scanner scanner) {
        this.instruments = instruments;
        this.scanner = scanner;
    }
    public boolean execute() {
        System.out.println("Which instrument do you want to remove?");
        System.out.print(">>>");
        String name = scanner.nextLine();
        String art = null;

        Instrument instrument = new Instrument(name, art);

        boolean result = instruments.remove(instrument);

        if (result) {
            System.out.println("Instrument was removed!");
        } else {
            System.out.println("Couldn't remove instrument." +
                    " Maybe check writing and please try again!");
        }
        return true;
    }

    public boolean run(String command) {
        return  "remove".equals(command);
    }
}
