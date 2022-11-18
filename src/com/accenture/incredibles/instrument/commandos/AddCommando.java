package com.accenture.incredibles.instrument.commandos;
import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommando {
    public void execute(ArrayList<Instrument> instrumentList, Scanner scanner) {
        System.out.println("Which instrument do you want to add?");
        System.out.print(">>>");
        String name = scanner.nextLine();
        System.out.println("What kind of instrument is it?");
        System.out.print(">>>");
        String art = scanner.nextLine();

        Instrument instrument = new Instrument(name, art);
        instrumentList.add(instrument);

        System.out.println("Instrument saved!");
    }
}
