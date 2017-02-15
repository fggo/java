package PhoneBookProject.UIHandler;

import javax.swing.*;
import java.awt.event.*;
import PhoneBookProject.PhoneBookManager.PhoneBookManager;

public class DeleteEventHandler implements ActionListener{
	JTextField delField;
	JTextArea textArea;
	
	public DeleteEventHandler(JTextField field, JTextArea area){
		delField = field;
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		String name = delField.getText();
		PhoneBookManager manager = PhoneBookManager.createMgrInst();
		boolean isDeleted = manager.deleteData(name);
		if(isDeleted)
			textArea.append("Data deleted[1] " + name + "\n");
		else
			textArea.append("No Data deleted[0]\n");
	}
}
