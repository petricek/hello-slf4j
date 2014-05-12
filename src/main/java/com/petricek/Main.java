package com.petricek;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.debug("Hi {}", 1);
        logger.error("Hey {}", 2);
        logger.warn("Ho {}", 3);
        logger.error("Hu {}", 4);
        logger.info("He {}", 5);
    }
}
