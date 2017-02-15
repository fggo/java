package PhoneBookProject.UIHandler;

import javax.swing.*;

import PhoneBookProject.PhoneBookManager.PhoneBookManager;

import java.awt.event.*;

public class SearchEventHandler implements ActionListener{
	JTextField searchField;
	JTextArea textArea;
	
	public SearchEventHandler(JTextField field, JTextArea area){
		searchField = field;
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		String name = searchField.getText();
		PhoneBookManager manager = PhoneBookManager.createMgrInst();
		String srchResult = manager.searchData(name);
		if(srchResult == null)
			textArea.append("No Search data result[0]\n");
		else{
			textArea.append("Search data result[1]\n");
			textArea.append(srchResult);
			textArea.append("\n");
		}
	}
}
