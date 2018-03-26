package com.huyaoban.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	/**
	 * 私有静态变量，类加载时初始化，确保了只能被初始化一次
	 */
	private static final LoadBalancer instance = new LoadBalancer();

	private List<String> serverList = null;

	/**
	 * 私有构造函数
	 */
	private LoadBalancer() {
		this.serverList = new ArrayList<String>();
	}

	/**
	 * 公有静态方法，返回唯一实例
	 * 
	 * @return
	 */
	public static LoadBalancer getInstance() {
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
