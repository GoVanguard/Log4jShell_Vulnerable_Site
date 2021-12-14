package com.govanguard.log4broke;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4BrokeApplication implements ApplicationRunner {
    private static final Logger logger = LogManager.getLogger(Log4BrokeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Log4BrokeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.debug("!!!!!!!!!!Don't use this for anything important! Intentionally vulnerable!!!!!!!!");

    }

}
