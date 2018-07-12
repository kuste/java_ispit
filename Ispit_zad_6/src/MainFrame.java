import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.Button;

public class MainFrame extends JFrame {
	private JPanel panel;
	private JTextArea tekst;
	private JLabel labela;
	private JLabel labelb;
	private JLabel labelc;
	private JTextField teksta;
	private JTextField tekstb;
	private JTextField tekstc;
	private JButton botun;
	private JScrollPane scroll;
	private JButton listall;
	private ArrayList<Solution> lista;
	private Solution sol;

	public MainFrame() {
		setLayout(new BorderLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);

		createComp();
		add(scroll, BorderLayout.EAST);
		add(panel, BorderLayout.CENTER);
		layoutComp();
		activate();
	}

	public void createComp() {

		tekst = new JTextArea(0, 28);
		scroll = new JScrollPane(tekst);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		labela = new JLabel("parametar a:");
		labelb = new JLabel("parametar b:");
		labelc = new JLabel("parametar c:");
		teksta = new JTextField(5);
		tekstb = new JTextField(5);
		tekstc = new JTextField(5);
		botun = new JButton("solve");
		listall = new JButton("list all");
		panel = new JPanel(new GridBagLayout());

		panel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(5, 5, 5, 5),
				BorderFactory.createTitledBorder("kvadratna jednadzba")));
		lista = new ArrayList<>();
	}

	public void layoutComp() {

		GridBagConstraints c = new GridBagConstraints();
		c.weighty = 0.5;
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 1;
		c.gridy = 0;

		panel.add(labela, c);
		c.gridx = 1;
		c.gridy = 1;
		panel.add(teksta, c);

		c.gridx = 1;
		c.gridy = 2;
		panel.add(labelb, c);

		c.gridx = 1;
		c.gridy = 3;
		panel.add(tekstb, c);

		c.gridx = 1;
		c.gridy = 4;
		panel.add(labelc, c);

		c.gridx = 1;
		c.gridy = 5;
		panel.add(tekstc, c);
		c.weighty = 2;
		c.gridx = 0;
		c.gridy = 6;
		panel.add(botun, c);
		c.weighty = 2;
		c.gridx = 2;
		c.gridy = 6;
		panel.add(listall, c);

	}

	public void activate() {
		botun.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(teksta.getText());
				int b = Integer.parseInt(tekstb.getText());
				int c = Integer.parseInt(tekstc.getText());
				Calculation calc = new Calculation();
				calc.calculate(a, b, c);
				String rj = calc.getRjesenje();

				sol = new Solution(rj);
				lista.add(sol);
				tekst.append("************************\n"+rj);
				

			}
		});
		listall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tekst.setText("");
				tekst.append(lista.toString());

			}
		});
	}

}
