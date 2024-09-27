package cpe.eng.kps.ku.ac.th.gui;

import java.awt.*;


import javax.swing.*;

public class TestGUI {
	static int i = 0;
	public static void main(String[] args){
		 JFrame frame = new JFrame("Test");
		 frame.setSize(250,300);
		 frame.setVisible(true);
		 frame.setEnabled (true);
		 JButton jb = new JButton("Click");
		 JPanel center = new JPanel();
		 center.add(jb);
		 frame.getContentPane().add(center, BorderLayout.CENTER);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 jb.addActionListener((event) -> {
				i++;
				jb.setText("Click " + i);
		 });
		 {};
		} 
}
	