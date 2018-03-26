package com.huyaoban.pattern;

public class Main {

	public static void main(String[] args) {
		SkinFactory factory = new LinuxSkinFactory();

		Button btn = factory.createButton();
		TextField txt = factory.createTextField();
		ComboBox box = factory.createComboBox();

		btn.display();
		txt.display();
		box.display();
	}

}
