package com.ignaciopiquerez.sofkachallange.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.Dimension;

public class PlayerHistoryPanel extends JPanel {
	private JTable table;
	private JButton btnMenu;
	/**
	 * Create the panel.
	 */
	public PlayerHistoryPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("Histórico de resultados");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTitle, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnMenu = new JButton("Menu principal");
		btnMenu.setMaximumSize(new Dimension(105, 25));
		add(btnMenu, BorderLayout.SOUTH);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}

	public void setBtnMenu(JButton btnMenu) {
		this.btnMenu = btnMenu;
	}

	
}
