package com.accenture.incredibles.instrument;

import com.accenture.incredibles.instrument.methods.Run;

public class InstrumentApp {
    public static void main(String[] args) {
        // create methods
        Run run = new Run();
        // ask user for input
        run.run();
    }
}