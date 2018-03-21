package com.huyaoban.pattern;

public class MainXml {

	public static void main(String[] args) {
		LoggerFactory factory = (LoggerFactory) XMLUtil.getLoggerFactory();
		Logger logger = factory.createLogger();
		logger.writeLog();
	}

}
