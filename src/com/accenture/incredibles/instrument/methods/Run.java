package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.commandos.AddCommando;
import com.accenture.incredibles.instrument.commandos.ShowCommando;
import com.accenture.incredibles.instrument.commandos.ExitCommando;
import com.accenture.incredibles.instrument.methods.Error;
import com.accenture.incredibles.instrument.models.Instrument;
import com.accenture.incredibles.instrument.models.Object;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public void run() {
        ArrayList<Instrument> instruments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        AddCommando addCommando = new AddCommando();
        ShowCommando showCommando = new ShowCommando();
        ExitCommando exitCommando = new ExitCommando();
        Error error = new Error();

        Object object = new Object();
        object.klavier(instruments);
        object.ukulele(instruments);
        object.ocarina(instruments);
        object.konzertGitarre(instruments);
        object.westernGitarre(instruments);

        System.out.println("Hi, welcome to your instrument list?" +
                " Please type 'show' to show your current list, 'add' to add instrument," +
                " and 'exit' if you want to leave!");

        boolean run = true;
        while (run) {
            System.out.print(">>>");
            String input = scanner.nextLine();
            if (input.equals("add")) {
                addCommando.execute(instruments, scanner);
            } else if (input.equals("exit")) {
                run = exitCommando.execute();
            } else if (input.equals("show")) {
                showCommando.execute(instruments);
            } else {
                error.error();
            }
        }
    }
}
