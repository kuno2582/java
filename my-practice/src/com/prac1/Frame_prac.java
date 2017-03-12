package com.prac1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

class DrawingCanvas extends Canvas {

	@Override
	public void paint(Graphics g) { // Graphics°¡ º×ÀÇ ¿ªÇÒ
		g.setColor(Color.GRAY);
		g.drawRect(0, 0, 480, 480);
		g.drawRect(100, 100, 200, 100);
	}

}

public class Frame_prac extends Frame implements ActionListener {

	public Frame_prac() {
		super("tetris");
		DrawingCanvas dc = new DrawingCanvas();
		add(dc);

		setSize(500, 530);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_UP) {

				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {

		new Frame_prac();

	}

}
