package com.huyaoban.pattern;

public abstract class Product {
	/**
	 * 所有产品类的公共业务方法
	 */
	public void methodSame() {
		System.out.println("公共业务方法");
	}

	/**
	 * 各具体产品类不同的业务方法
	 */
	public abstract void methodDiff();
}
