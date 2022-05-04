package sofkachallange.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GameConfig extends JPanel {
	private JTextField textFldQuestion;
	private JTextField textFldAnsw1;
	private JTextField textFldAnsw2;
	private JTextField textFldAnsw3;
	private JTextField textAnswValid;
	private JComboBox<Integer> comboBoxCategory;
	/**
	 * Create the panel.
	 */
	public GameConfig() {
		
		JLabel lblTitle = new JLabel("Genera tu pregunta");
		
		JLabel lblQuestion = new JLabel("Pregunta");
		
		textFldQuestion = new JTextField();
		textFldQuestion.setColumns(10);
		
		JLabel lblAnsw1 = new JLabel("Respuesta incorrecta");
		
		textFldAnsw1 = new JTextField();
		textFldAnsw1.setColumns(10);
		
		JLabel lblAnsw2 = new JLabel("Respuesta incorrecta");
		
		textFldAnsw2 = new JTextField();
		textFldAnsw2.setColumns(10);
		
		JLabel lblAnsw3 = new JLabel("Respuesta incorrecta");
		
		textFldAnsw3 = new JTextField();
		textFldAnsw3.setColumns(10);
		
		JLabel lblAnswValid = new JLabel("Respuesta correcta");
		
		textAnswValid = new JTextField();
		textAnswValid.setColumns(10);
		
		JLabel lblCategory = new JLabel("Categor\u00EDa");
		
		comboBoxCategory = new JComboBox<Integer>();
		
		JButton btnCreate = new JButton("Crear Pregunta");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(171)
							.addComponent(lblTitle))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblQuestion)
									.addGap(75)
									.addComponent(textFldQuestion, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAnsw1)
									.addGap(18)
									.addComponent(textFldAnsw1))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAnsw2)
									.addGap(18)
									.addComponent(textFldAnsw2, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAnsw3)
										.addComponent(lblAnswValid)
										.addComponent(lblCategory))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(textAnswValid, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
											.addComponent(textFldAnsw3, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))))
					.addGap(11)
					.addComponent(btnCreate)
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitle)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFldQuestion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblQuestion))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnsw1)
						.addComponent(textFldAnsw1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnsw2)
						.addComponent(textFldAnsw2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnsw3)
						.addComponent(textFldAnsw3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAnswValid)
						.addComponent(textAnswValid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategory)
						.addComponent(comboBoxCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(btnCreate)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
	}
}
