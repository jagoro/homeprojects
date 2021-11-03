package com.softdev.log.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;


public class UtilLog {
	
	private static Logger log = LogManager.getRootLogger();

	public static void registrarInfo(String mensaje) {

			log.info(mensaje);
	
	}
}
