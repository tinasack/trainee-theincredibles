package com.accenture.incredibles.instrument.commandos;
import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommando implements Commando {

    private ArrayList<Instrument> instruments;
    private Scanner scanner;

    public AddCommando(ArrayList<Instrument> instruments, Scanner scanner) {
        this.instruments = instruments;
        this.scanner = scanner;
    }
    public boolean execute() {
        System.out.println("Which instrument do you want to add?");
        System.out.print(">>>");
        String name = scanner.nextLine();
        System.out.println("What kind of instrument is it?");
        System.out.print(">>>");
        String art = scanner.nextLine();

        Instrument instrument = new Instrument(name, art);
        instruments.add(instrument);

        System.out.println("Instrument saved!");
        return true;
    }

    public boolean run(String command) {
        return  "add".equals(command);
    }
}
