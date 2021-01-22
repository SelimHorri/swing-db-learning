package swing_proj;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {
// Begin Class

	public static void main(String[] args) {
	// Begin main()
		
		// new My_GUI();
		
		JFrame fr = new JFrame();
		
		String names[][] = { {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 {"1000","slim","horri"},
							 {"1001","hinda","abassi"},
							 {"1002","hichem","abbassi"},
							 {"1003","aziz","horri"},
							 };
		String header[] = {"id","fname","lname"};
		JTable t = new JTable(names,header);
		t.setBounds(30,40,1000,1000);
		JScrollPane s = new JScrollPane(t);
		fr.add(s);
		fr.setVisible(true);
		// fr.pack();
		fr.setSize(300, 400);
		
	// End main()
	}

// End Class
}
