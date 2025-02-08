package com.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class LoggerLoad {
	

    private static final Logger logger = LogManager.getLogger(LoggerLoad.class);
	private Object log4j;

    static {
        // Ensure log directory exists
        File logDir = new File("logs");
        if (!logDir.exists()) {
            if (logDir.mkdirs()) {
                System.out.println("Log directory created successfully.");
            } else {
                System.err.println("Failed to create log directory.");
            }
        }

        // Set directory permissions (for Unix-based systems)
        logDir.setWritable(true, false);  // Allow writing for all users (use 'true' for recursive setting if needed)
        
        // Check if log file exists and create it if it doesn't
        File logFile = new File("C:\\Users\\rakhy\\eclipse-workspace-new\\DS_algo_project\\logs\\Mylog4j-log.log");
        try {
            if (!logFile.exists()) {
                if (logFile.createNewFile()) {
                    System.out.println("Log file created successfully.");
                } else {
                    System.err.println("Failed to create log file.");
                }
            }

            // Set file permissions (for Unix-based systems)
            logFile.setWritable(true);  // Grant write permissions

            // Test writing to the log file
            FileWriter writer = new FileWriter(logFile, true);
            writer.write("Test log entry - Log file is writable.\n");
            writer.close();
            System.out.println("Log file write test successful!");

        } catch (IOException e) {
            System.err.println("Log file write test failed! Check permissions.");
            e.printStackTrace();
        }

        // Set the Log4j configuration file
        System.setProperty("log4j.configurationFile", "C:\\Users\\rakhy\\eclipse-workspace-new\\DS_algo_project\\src\\test\\resources\\Confg\\confg.properties");
        System.getProperty("log4j.configurationFile");
    }

    

   	 public static void info(String message) {

   		 logger.info(message); 	
		

		 }

	 public static void warn(String message) {

		 logger.warn(message);

		}

	 public static void error(String message) {

		 logger.error(message);

		}

	 public static void fatal(String message) {

		 logger.fatal(message);

		}

	 public static void debug(String message) {

		 logger.debug(message);

		}

}