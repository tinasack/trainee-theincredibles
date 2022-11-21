package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.commandos.*;
import com.accenture.incredibles.instrument.models.Instrument;
import com.accenture.incredibles.instrument.models.NewInstrument;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public void run() {
        ArrayList<Instrument> instruments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        CreateCommandoList commandoList = new CreateCommandoList();
        Error error = new Error();
        CreateInstruments createInstruments = new CreateInstruments();
        createInstruments.execute(instruments);
        ArrayList<Commando> commandos = commandoList.createCommandoList(instruments, scanner);

        System.out.println("Hi, welcome to your instrument list!");
        System.out.println("Please type 'show' to show your current list, 'add' to add instrument," +
                " 'remove' to remove instrument from list and 'exit' if you want to leave!");

        boolean run = true;
        while (run) {
            System.out.print(">>>");
            String answer = scanner.nextLine();
            String input = answer.toLowerCase();

            boolean found = false;
            for (Commando commando : commandos) {
                if (commando.run(input)) {
                    run = commando.execute();
                    found = true;
                    break;
                }
            }

            if (!found) {
                error.error();
            }
        }
    }
}
