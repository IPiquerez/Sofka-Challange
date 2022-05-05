package com.ignaciopiquerez.sofkachallange.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private JButton btnAnsw1;
	
	private JButton btnAnsw2;
	
	private JButton btnAnsw3;
	
	private JButton btnAnsw4;
	
	private JLabel lblQuestion;
	
	private JButton btnEnd;
	
	private JLabel  lblPoints;
	
	private JLabel  lblLevel;
	
	private JLabel lblAward;
	

	/**
	 * Create the panel.
	 */
	public GamePanel() {
		
		btnAnsw1 = new JButton("Respuesta 1");
		
		btnAnsw2 = new JButton("Respuesta 2");
		
		btnAnsw3 = new JButton("Respuesta 3");
		
		btnAnsw4 = new JButton("Respuesta 4");
		
		lblQuestion = new JLabel("\u00BFCual es la respuesta correcta?");
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnEnd = new JButton("Retirarse");
		
		lblPoints = new JLabel("0");
		
		lblLevel = new JLabel("Nivel 1");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblAward = new JLabel("Por 100 puntos");
		lblAward.setHorizontalAlignment(SwingConstants.CENTER);
		lblAward.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAward.setForeground(Color.GREEN);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(618, Short.MAX_VALUE)
					.addComponent(lblLevel)
					.addGap(596)
					.addComponent(lblPoints)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(294)
					.addComponent(lblQuestion, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
					.addGap(277))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(601, Short.MAX_VALUE)
					.addComponent(lblAward)
					.addGap(592))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnsw1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
						.addComponent(btnAnsw3, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnsw2, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
						.addComponent(btnAnsw4, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(603, Short.MAX_VALUE)
					.addComponent(btnEnd)
					.addGap(599))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPoints)
						.addComponent(lblLevel))
					.addGap(37)
					.addComponent(lblAward)
					.addGap(26)
					.addComponent(lblQuestion)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnsw1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnsw2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnsw3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnsw4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addGap(167)
					.addComponent(btnEnd)
					.addGap(266))
		);
		setLayout(groupLayout);
	}

	public JButton getBtnAnsw1() {
		return btnAnsw1;
	}

	public void setBtnAnsw1(JButton btnAnsw1) {
		this.btnAnsw1 = btnAnsw1;
	}

	public JButton getBtnAnsw2() {
		return btnAnsw2;
	}

	public void setBtnAnsw2(JButton btnAnsw2) {
		this.btnAnsw2 = btnAnsw2;
	}

	public JButton getBtnAnsw3() {
		return btnAnsw3;
	}

	public void setBtnAnsw3(JButton btnAnsw3) {
		this.btnAnsw3 = btnAnsw3;
	}

	public JButton getBtnAnsw4() {
		return btnAnsw4;
	}

	public void setBtnAnsw4(JButton btnAnsw4) {
		this.btnAnsw4 = btnAnsw4;
	}

	public JLabel getLblQuestion() {
		return lblQuestion;
	}

	public void setLblQuestion(JLabel lblQuestion) {
		this.lblQuestion = lblQuestion;
	}

	public JButton getBtnEnd() {
		return btnEnd;
	}

	public void setBtnEnd(JButton btnEnd) {
		this.btnEnd = btnEnd;
	}

	public JLabel getLblPoints() {
		return lblPoints;
	}

	public void setLblPoints(JLabel lblPoints) {
		this.lblPoints = lblPoints;
	}

	public JLabel getLblLevel() {
		return lblLevel;
	}

	public void setLblLevel(JLabel lblLevel) {
		this.lblLevel = lblLevel;
	}

	public JLabel getLblAward() {
		return lblAward;
	}

	public void setLblAward(JLabel lblAward) {
		this.lblAward = lblAward;
	}
}
