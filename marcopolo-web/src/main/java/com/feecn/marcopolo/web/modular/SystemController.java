package com.feecn.marcopolo.web.modular;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author pczhangyu
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    private static Logger logger = LogManager.getLogger(SystemController.class);

    @GetMapping(value="/log/level")
    public ResponseEntity<?> changeLogLevel(@RequestParam(value="level")String level)
    {
        logger.info("{}, log level has been changed.",level);
        logger.info("{}",logger.getLevel());
        Level newLevel = Level.toLevel(level);
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
        loggerConfig.setLevel(newLevel);
        ctx.updateLoggers();
        return ResponseEntity.ok(level);
    }

    @RequestMapping(value = "/log/current/level",method = RequestMethod.GET)
    public ResponseEntity<?> currentLogLevel(){
        logger.info("{}",logger.getLevel());
        return ResponseEntity.ok(logger.getLevel());
    }

    @GetMapping(value="/log/test")
    public ResponseEntity<?> testLogFunction()
    {
        logger.info("{}, log level has been changed.",logger.getLevel());
        return ResponseEntity.ok(logger.getLevel());
    }

//    public static org.apache.logging.log4j.Level toLog4jLevel(Level level) {
//        if (level == Level.ALL) {
//            return Level.ALL;
//        }
//        if (level == Level.TRACE) {
//            return Level.TRACE;
//        }
//        if (level == Level.DEBUG) {
//            return Level.DEBUG;
//        }
//        if (level == Level.INFO)
//            return org.apache.logging.log4j.Level.INFO;
//        if (level == Level.WARN)
//            return org.apache.logging.log4j.Level.WARN;
//        if (level == Level.ERROR)
//            return org.apache.logging.log4j.Level.ERROR;
//        return org.apache.logging.log4j.Level.OFF;
//    }


}
