package com.huyaoban.pattern;

public class Main {

	public static void main(String[] args) {
		Product product = null;
		product = ProductFactory.getProduct("A");
		if (product != null) {
			product.methodDiff();
			product.methodSame();
		}
	}

}
