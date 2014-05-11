package com.edward.utils;



import java.awt.BorderLayout;

import javax.swing.*;

public class FrameRunner extends JFrame {
	private static final long serialVersionUID = 1L;
    public final void setDesign() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) {   
        }
    }
	FrameRunner() {
		super("Utils"); {
			setDesign();
			JPanel left = new JPanel();
			JPanel right = new JPanel();
			left.add(CalanderButton.getButton(), BorderLayout.LINE_START);
			left.add(CalculatorButton.getButton(), BorderLayout.LINE_END);
			right.add(OrderButton.getOrderButton(), BorderLayout.LINE_START);
			right.add(TW.getTW(), BorderLayout.LINE_END);
			add(left, BorderLayout.LINE_START);
			add(right, BorderLayout.LINE_END);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
			setVisible(true);
		}
	}

}
