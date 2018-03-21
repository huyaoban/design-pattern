package com.huyaoban.pattern;

public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new DatabaseLogger();
	}

}
