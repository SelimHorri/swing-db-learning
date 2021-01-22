package swing_proj;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Guii {
// Begin Class
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
// -----------------------------Initialize the contents of the frame.-------------------------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100,100,519,334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMessage = new JLabel("Message :");
		lblMessage.setBounds(45,43,82,28);
		frame.getContentPane().add(lblMessage);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(196,43,145,28);
		frame.getContentPane().add(label);
		
		JButton btnClick = new JButton("click");
		btnClick.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent arg0) {
				
				label.setText("Hi Mr.Reese");
				JOptionPane.showMessageDialog(null,"HO");
				
			}
		});
		btnClick.setBackground(Color.PINK);
		btnClick.setForeground(Color.DARK_GRAY);
		btnClick.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 15));
		btnClick.setBounds(10,171,114,43);
		frame.getContentPane().add(btnClick);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int inp = JOptionPane.showConfirmDialog(null,"you want delete?");
				if (inp == 0)
					label.setText("");
									
			}
		});
		btnReset.setForeground(Color.GREEN);
		btnReset.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 15));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(299, 171, 114, 43);
		frame.getContentPane().add(btnReset);
		
		JButton btnExitt = new JButton("exitt");
		btnExitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnExitt.setBounds(171, 225, 89, 23);
		frame.getContentPane().add(btnExitt);
		
		textField = new JTextField();
		textField.setBounds(367, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(367, 47, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					int n1,n2,sum = 0;
					
					n1 = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					sum = n1 + n2;
					
					textField_2.setText(Integer.toString(sum));
				
				}
				catch (NumberFormatException ex) {
					
					System.out.print("\n\n Please Enter Numbers only ! \n\n");
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null,"Please Enter numbers only !");
					
				}
				
			}
		});
		btnAdd.setBounds(159, 113, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					int n1,n2,sub = 0;
					
					n1 = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					sub = n1 - n2;
					
					textField_2.setText(Integer.toString(sub));
					
				}
				catch (NumberFormatException ex) {
					
					System.out.print("\n\n Please Enter Numbers only ! \n\n");
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null,"Please Enter numbers only !");
					
				}
				
			}
		});
		btnSub.setBounds(269, 113, 89, 23);
		frame.getContentPane().add(btnSub);
		
		textField_2 = new JTextField();
		textField_2.setBounds(367, 114, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSwitch = new JButton("switch");
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StringBuilder sw = new StringBuilder();
				sw.append(textField.getText());
				textField.setText(textField_1.getText());
				textField_1.setText(sw.toString());
				
			}
		});
		btnSwitch.setBounds(231, 10, 89, 23);
		frame.getContentPane().add(btnSwitch);
		
	// End initialize()
	}
	
// ------------------------------Create the application.--------------------------------------------------------------------------------
	public Guii () {
		initialize();
	}

// ------------------------------Launch the application. main() ------------------------------------------------------------------------
	public static void main (String[] args) {
	// Begin main()
		
		EventQueue.invokeLater(new Runnable() {
			public void run () {
				try {
					Guii window = new Guii();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// End main()
	}
	
// End Class
}
