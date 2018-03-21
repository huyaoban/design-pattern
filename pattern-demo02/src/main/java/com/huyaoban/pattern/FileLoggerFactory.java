package com.huyaoban.pattern;

public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new FileLogger();
	}

}
