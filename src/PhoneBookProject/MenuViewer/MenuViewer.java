package PhoneBookProject.MenuViewer;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("---MENU---");
		System.out.println("1. Input Data");
		System.out.println("2. Terminate program.");
		System.out.print("Your Choice >> ");
	}
}
