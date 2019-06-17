package com.feecn.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.error("{},{}","a","b");
        logger.info("{},{}","a","c");
        logger.trace("{},{}","a","d");
        System.out.println( "Hello World!" );
    }
}
