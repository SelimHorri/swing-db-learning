package swing_proj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class My_GUI extends JFrame implements ActionListener {
// Begin Class
	
	JRadioButton r1,r2;
	ButtonGroup gr;
	JButton btn;
	
	public My_GUI () { // Constructor
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		gr = new ButtonGroup();
		btn = new JButton("Ok");
		
		setSize(700,500);
		setLayout(null);
		setVisible(true);
		
		r1.setBounds(110,60,100,50);
		r2.setBounds(110,100,120,50);
		
		gr.add(r1);
		gr.add(r2);
		
		btn.setBounds(100,160,90,40);
		btn.addActionListener(this);
		
		add(r1);
		add(r2);
		add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed (ActionEvent ae) {
		
		if (r1.isSelected()) {
			
			System.out.print("You're a MALE !!");
			JOptionPane.showMessageDialog(this,"You're a MALE !!\n");
			
		}
		
		else {
			
			if (r2.isSelected()) {
				
				System.out.print("You're a FEMALE !!!\n");
				JOptionPane.showMessageDialog(this,"You're a FEMALE !!!");
				
			}
			
		}
		
	}
	
	
// End Class
}
