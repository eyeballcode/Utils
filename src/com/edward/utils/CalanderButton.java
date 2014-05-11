package com.edward.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalanderButton {

	public static JButton getButton() {
		JButton cal = new JButton("Calander");
		cal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Calander c = new Calander();
			}
			
		});
		return cal;
	}

}
