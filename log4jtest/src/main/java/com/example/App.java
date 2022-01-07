package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        Logger logger = LogManager.getLogger();

        logger.trace("start");

        int a = 1;
        int b = 2;
        String c = null;

        logger.debug("debug");
        logger.info("info a = {}", a);
        logger.warn("warn b = {}", b);
        logger.error("error c = {}", c);
        logger.fatal("fatal");
        logger.trace("end");
    }
}
