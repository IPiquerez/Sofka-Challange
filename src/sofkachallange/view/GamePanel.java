package sofkachallange.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

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
		
		btnEnd = new JButton("Retirarse");
		
		lblPoints = new JLabel("0");
		
		lblLevel = new JLabel("Nivel 1");
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblAward = new JLabel("Por 100 puntos");
		lblAward.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAward.setForeground(Color.GREEN);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnsw1, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
						.addComponent(btnAnsw3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnsw2, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnAnsw4, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(138)
					.addComponent(lblQuestion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(162))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(180)
					.addComponent(btnEnd)
					.addContainerGap(181, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(199, Short.MAX_VALUE)
					.addComponent(lblLevel)
					.addGap(186)
					.addComponent(lblPoints)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(181)
					.addComponent(lblAward)
					.addContainerGap(183, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPoints)
						.addComponent(lblLevel))
					.addGap(27)
					.addComponent(lblAward)
					.addGap(30)
					.addComponent(lblQuestion)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnsw1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnsw2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnsw3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnsw4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEnd)
					.addGap(16))
		);
		setLayout(groupLayout);
	}

}
