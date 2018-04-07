package com.cleartrip.commonutilities;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConfig {
    private static Logger logger;

    public static Logger getLogger() {
        logger = LoggerFactory.getLogger(LogConfig.class);
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        return logger;
    }

}
