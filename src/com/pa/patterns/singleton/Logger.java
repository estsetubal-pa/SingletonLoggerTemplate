/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.patterns.singleton;

import java.io.*;
import java.util.Date;

/**
 * @author patricia.macedo
 * Singleton pattern
 */
public  class Logger {


    private static final String LOGGERFILE = "logger.txt";
    private PrintStream printStream;

    public Logger() {
        connect();
    }

    private boolean connect() {
        if (printStream == null) {
            try {
                printStream = new PrintStream(new FileOutputStream(LOGGERFILE), true);
            } catch (FileNotFoundException ex) {
                printStream = null;
                return false;

            }
            return true;
        }
        return true;
    }



    public void writeToLog(String str) throws LoggerException {
        if (printStream == null) {
            throw new LoggerException("Connection fail");
        }

        printStream.println(new Date().toString() + "  " + str);

    }


}
