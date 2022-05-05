package com.ignaciopiquerez.sofkachallange.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class ResultPanel extends JPanel {


	JLabel lblResult;
	JLabel lblPointsEarned;
	JLabel lblRoundsReached;
	JButton btnContinue;
	/**
	 * Create the panel.
	 */
	public ResultPanel() {
		
		JLabel lblTitle = new JLabel("Resultado Final:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblResult = new JLabel("Victoria!");
		lblResult.setForeground(Color.GREEN);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		lblPointsEarned = new JLabel("Puntos obtenidos: x");
		lblPointsEarned.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblRoundsReached = new JLabel("Ultima ronda: x");
		lblRoundsReached.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnContinue = new JButton("Continuar");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(547)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnContinue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblRoundsReached, Alignment.LEADING)
						.addComponent(lblResult, Alignment.LEADING)
						.addComponent(lblTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblPointsEarned, Alignment.LEADING))
					.addContainerGap(607, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(79)
					.addComponent(lblTitle)
					.addGap(203)
					.addComponent(lblResult)
					.addGap(95)
					.addComponent(lblPointsEarned)
					.addGap(38)
					.addComponent(lblRoundsReached)
					.addGap(122)
					.addComponent(btnContinue, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(57, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public JLabel getLblResult() {
		return lblResult;
	}

	public void setLblResult(JLabel lblResult) {
		this.lblResult = lblResult;
	}

	public JLabel getLblPointsEarned() {
		return lblPointsEarned;
	}

	public void setLblPointsEarned(JLabel lblPointsEarned) {
		this.lblPointsEarned = lblPointsEarned;
	}

	public JLabel getLblRoundsReached() {
		return lblRoundsReached;
	}

	public void setLblRoundsReached(JLabel lblRoundsReached) {
		this.lblRoundsReached = lblRoundsReached;
	}

	public JButton getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(JButton btnContinue) {
		this.btnContinue = btnContinue;
	}
	
}
