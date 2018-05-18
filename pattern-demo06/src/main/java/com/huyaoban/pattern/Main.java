package com.huyaoban.pattern;

public class Main {

	public static void main(String[] args) {
		LoadBalancer balancer1;
		LoadBalancer balancer2;
		LoadBalancer balancer3;
		LoadBalancer balancer4;

		balancer1 = LoadBalancer.getInstance();
		balancer2 = LoadBalancer.getInstance();
		balancer3 = LoadBalancer.getInstance();
		balancer4 = LoadBalancer.getInstance();

		if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("服务器负载均衡器具有唯一性");
		}

		balancer1.addServer("Server 1");
		balancer2.addServer("Server 2");
		balancer3.addServer("Server 3");
		balancer4.addServer("Server 4");

		// 模拟客户端请求的分发
		for (int i = 0; i < 100; i++) {
			String server = balancer1.getServer();
			System.out.println("分发请求值服务器:" + server);
		}
	}

}
