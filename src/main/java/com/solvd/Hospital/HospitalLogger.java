package com.solvd.Hospital;

import java.io.IOException;
import java.util.logging.*;

public class HospitalLogger {
    public static final Logger log = Logger.getLogger(HospitalLogger.class.getName());

    static {
        try {

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);

            FileHandler fileHandler = new FileHandler("hospital_logs.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());


            log.addHandler(consoleHandler);
            log.addHandler(fileHandler);
            log.setLevel(Level.ALL);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}