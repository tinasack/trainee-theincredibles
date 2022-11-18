package com.accenture.incredibles.instrument.commandos;

import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCommando {
    public void execute(ArrayList<Instrument> instrumentList, Scanner input) {
        System.out.println("Which instrument do you want to remove?");
        System.out.print(">>>");
        String name = input.nextLine();
        String art = null;

        Instrument instrument = new Instrument(name, art);

        boolean result = instrumentList.remove(instrument);

        if (result) {
            System.out.println("Instrument was removed!");
        } else {
            System.out.println("Couldn't remove instrument. Please try again!");
        }
    }
}
