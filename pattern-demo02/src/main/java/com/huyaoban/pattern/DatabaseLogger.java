package com.huyaoban.pattern;

public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("数据库日志");
	}

}
