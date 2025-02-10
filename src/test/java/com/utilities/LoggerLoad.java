package com.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class LoggerLoad {
	

    private static final Logger logger = LogManager.getLogger();
	private Object log4j2;
  

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