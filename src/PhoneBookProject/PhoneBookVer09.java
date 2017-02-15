package PhoneBookProject;

import javax.swing.UIManager;

import PhoneBookProject.MenuChoiceException.MenuChoiceException;
import PhoneBookProject.MenuViewer.MenuViewer;
import PhoneBookProject.PhoneBookManager.PhoneBookManager;
import PhoneBookProject.UIHandler.SearchDelFrame;

interface MENU_CHOICE{
	int INPUT = 1, EXIT = 2;
}

public class PhoneBookVer09 {
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			SearchDelFrame winFrame = new SearchDelFrame("PhoneBookVer 0.9.1");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		PhoneBookManager manager = PhoneBookManager.createMgrInst();
		
		int choice;
		while(true){
			MenuViewer.showMenu();
			
			try{
				choice = MenuViewer.sc.nextInt(); MenuViewer.sc.nextLine();
				
				switch(choice){
				case MENU_CHOICE.INPUT:
					manager.inputData();
					break;
				case MENU_CHOICE.EXIT:
					manager.showPhoneBookInfo();
					manager.writeToFile();
					System.out.println("Exit the program...");
					System.exit(0);
					return;
				default:
					throw new MenuChoiceException(choice);
				}
			}
			catch(MenuChoiceException e){
				e.showWrongChoice();
				System.out.println("Restart MENU CHOICE...");
			}
		}
		
	}
}
