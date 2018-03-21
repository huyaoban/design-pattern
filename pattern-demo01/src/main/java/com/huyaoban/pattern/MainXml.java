package com.huyaoban.pattern;

public class MainXml {

	public static void main(String[] args) {
		Product product = null;
		String type = XMLUtil.getProductType();
		product = ProductFactory.getProduct(type);
		if (product != null) {
			product.methodDiff();
			product.methodSame();
		}
	}

}
