package com.ignaciopiquerez.sofkachallange.view;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel{
	private JButton btnStart;
	private JButton btnHistory;
	
	public MainPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		btnStart = new JButton("Iniciar el juego");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnHistory = new JButton("Historial de partidas");
		btnHistory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(462, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnHistory, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
					.addGap(419))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(251)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnHistory, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(236, Short.MAX_VALUE))
		);
		setLayout(gl_contentPane);
	}

	public JButton getBtnStart() {
		return btnStart;
	}

	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}

	public JButton getBtnHistory() {
		return btnHistory;
	}

	public void setBtnHistory(JButton btnHistory) {
		this.btnHistory = btnHistory;
	}
	
	
}
