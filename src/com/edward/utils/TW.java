package com.edward.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TW {
	private static String[] args;
		
		private static void getB() {
			ShapedWindowDemo.main(args);
		}
	public static JButton getTW() {

		JButton tw = new JButton("Open a surprise window");
		tw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getB();
				
				
			}
			
		});
		return tw;
	}

}
