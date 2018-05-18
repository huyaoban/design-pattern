package com.huyaoban.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	// 如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile
	private volatile static LoadBalancer instance = null;

	private List<String> serverList = null;

	/**
	 * 私有构造函数
	 */
	private LoadBalancer() {
		this.serverList = new ArrayList<String>();
	}

	/**
	 * 双重检查锁定(Double-Check Locking)
	 * 
	 * @return
	 */
	public static LoadBalancer getInstance() {
		// 第一重判断
		if (instance == null) {
			// 锁定代码块
			synchronized (LoadBalancer.class) {
				// 第二重判断
				if (instance == null) {
					instance = new LoadBalancer();
				}
			}
		}
		return instance;
	}

	/**
	 * 添加服务器
	 * 
	 * @param server
	 */
	public void addServer(String server) {
		this.serverList.add(server);
	}

	/**
	 * 移除服务器
	 * 
	 * @param server
	 */
	public void removeServer(String server) {
		this.serverList.remove(server);
	}

	/**
	 * 随机获取服务器
	 * 
	 * @return
	 */
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return serverList.get(i);
	}
}
