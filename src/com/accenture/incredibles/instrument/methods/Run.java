package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.commandos.AddCommando;
import com.accenture.incredibles.instrument.commandos.RemoveCommando;
import com.accenture.incredibles.instrument.commandos.ShowCommando;
import com.accenture.incredibles.instrument.commandos.ExitCommando;
import com.accenture.incredibles.instrument.models.Instrument;
import com.accenture.incredibles.instrument.models.NewInstrument;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public void run() {
        ArrayList<Instrument> instrumentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        AddCommando addCommando = new AddCommando();
        ShowCommando showCommando = new ShowCommando();
        ExitCommando exitCommando = new ExitCommando();
        RemoveCommando removeCommando = new RemoveCommando();
        Error error = new Error();

        NewInstrument newInstrument = new NewInstrument();
        newInstrument.klavier(instrumentList);
        newInstrument.ukulele(instrumentList);
        newInstrument.ocarina(instrumentList);
        newInstrument.konzertGitarre(instrumentList);
        newInstrument.westernGitarre(instrumentList);

        System.out.println("Hi, welcome to your instrument list!");
        System.out.println("Please type 'show' to show your current list, 'add' to add instrument," +
                " 'remove' to remove instrument from list and 'exit' if you want to leave!");

        boolean run = true;
        while (run) {
            System.out.print(">>>");
            String answer = scanner.nextLine();
            String input = answer.toLowerCase();
            if (input.equals("add")) {
                addCommando.execute(instrumentList, scanner);
            } else if (input.equals("exit")) {
                run = exitCommando.execute();
            } else if (input.equals("show")) {
                showCommando.execute(instrumentList);
            } else if (input.equals("remove")) {
                removeCommando.execute(instrumentList, scanner);
            } else {
                error.error();
            }
        }
    }
}
