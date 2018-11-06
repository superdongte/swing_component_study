package swing_component_study;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContentPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;

	/**
	 * Create the frame.
	 */
	public ContentPaneEx() {
		setTitle("ContentPane과 frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("New button");
		contentPane.add(btnCancel);
		
		JButton btnClosed = new JButton("New button");
		contentPane.add(btnClosed);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		if (e.getSource() == btnOk) {
			do_btnOk_actionPerformed(e);
		}
	}
	protected void do_btnOk_actionPerformed(ActionEvent e) {
	
	}
}
