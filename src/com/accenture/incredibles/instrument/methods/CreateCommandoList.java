package com.accenture.incredibles.instrument.methods;

import com.accenture.incredibles.instrument.commandos.*;
import com.accenture.incredibles.instrument.models.Instrument;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateCommandoList {
    public ArrayList<Commando> createCommandoList(ArrayList<Instrument> instruments, Scanner scanner) {
        ArrayList<Commando> commandos = new ArrayList<>();
        commandos.add(new AddCommando(instruments, scanner ));
        commandos.add(new ExitCommando());
        commandos.add(new ShowCommando(instruments));
        commandos.add(new RemoveCommando(instruments, scanner ));
        return commandos;
    }
}
