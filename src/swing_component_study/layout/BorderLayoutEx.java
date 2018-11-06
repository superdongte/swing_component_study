package swing_component_study.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BorderLayoutEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutEx frame = new BorderLayoutEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BorderLayoutEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "borderLayout", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		contentPane.add(btnNewButton_1, BorderLayout.NORTH);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(this);
		contentPane.add(btnNewButton_2, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(this);
		contentPane.add(btnNewButton_3, BorderLayout.CENTER);
		
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4, BorderLayout.WEST);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
	}
}
