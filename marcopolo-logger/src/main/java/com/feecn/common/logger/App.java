package com.feecn.common.logger;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;
//import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;

import java.util.Collection;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

//    public Map<String, Object> chgLogLevel() {
//        Collection<Logger> current = LoggerContext.getContext(false).getLoggers();
//        Collection<org.apache.logging.log4j.core.Logger> notcurrent = LoggerContext.getContext().getLoggers();
//        Collection<org.apache.logging.log4j.core.Logger> allConfig = current;
//        allConfig.addAll(notcurrent);
//        for (org.apache.logging.log4j.core.Logger log:allConfig){
//            log.setLevel(Level.DEBUG);
//        }
//    }
}
