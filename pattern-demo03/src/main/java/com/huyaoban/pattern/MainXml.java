package com.huyaoban.pattern;

public class MainXml {

	public static void main(String[] args) {
		SkinFactory factory = (SkinFactory) XMLUtil.getSkinFactory();

		Button btn = factory.createButton();
		TextField txt = factory.createTextField();
		ComboBox box = factory.createComboBox();

		btn.display();
		txt.display();
		box.display();
	}

}
