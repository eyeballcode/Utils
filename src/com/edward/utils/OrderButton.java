package com.edward.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OrderButton {
		static String[] args;
	private static void getB() {
		Orderer.main(args);
	}
	public static JButton getOrderButton() {
		JButton tw = new JButton("Order something");
		tw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getB();
			}
			
		});
		return tw;
	}

}
