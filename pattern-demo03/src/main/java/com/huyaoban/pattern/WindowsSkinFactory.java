package com.huyaoban.pattern;

public class WindowsSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public TextField createTextField() {
		return new WindowsTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new WindowsComboBox();
	}

}
