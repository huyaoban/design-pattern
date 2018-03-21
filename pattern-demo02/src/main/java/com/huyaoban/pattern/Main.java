package com.huyaoban.pattern;

public class Main {

	public static void main(String[] args) {
		LoggerFactory factory = new FileLoggerFactory();
		Logger logger = factory.createLogger();
		logger.writeLog();
	}

}
