package com.reestts.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLog {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MainLog.class);

        logger.trace("first level");
        logger.debug("second level");
        logger.info("third level");
        logger.warn("fourth level");
        logger.error("fifth level");
    }
}
