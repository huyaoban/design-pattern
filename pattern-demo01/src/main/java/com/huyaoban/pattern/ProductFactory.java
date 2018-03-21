package com.huyaoban.pattern;

/**
 * 产品工厂， 当需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节
 * 
 * @author Administrator
 *
 */
public class ProductFactory {
	/**
	 * 静态工厂方法
	 */
	public static Product getProduct(String type) {
		Product product = null;
		if ("A".equalsIgnoreCase(type)) {
			product = new ConcreteProductA();
		} else if ("B".equalsIgnoreCase(type)) {
			product = new ConcreteProductB();
		}
		
		return product;
	}
}
