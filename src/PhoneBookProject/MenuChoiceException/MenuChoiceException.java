package PhoneBookProject.MenuChoiceException;

public class MenuChoiceException extends Exception{
	int wrongChoice;
	
	public MenuChoiceException(int wrongChoice){
		super("wrong menu choice!");
		this.wrongChoice = wrongChoice;
	}
	
	public void showWrongChoice(){
		System.out.printf("wrong menu choice[%d]!\n", wrongChoice);
	}
}
