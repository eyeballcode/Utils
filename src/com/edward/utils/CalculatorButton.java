package com.edward.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorButton {
	public static JButton getButton() {
		JButton cal = new JButton("Calculator");
		cal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Calculator c = new Calculator();
			}
			
		});
		return cal;
	}

}
