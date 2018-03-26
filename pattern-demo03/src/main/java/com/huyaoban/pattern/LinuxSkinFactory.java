package com.huyaoban.pattern;

public class LinuxSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextField createTextField() {
		return new LinuxTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new LinuxComboBox();
	}

}
