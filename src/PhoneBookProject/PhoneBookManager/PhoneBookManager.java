package PhoneBookProject.PhoneBookManager;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

import PhoneBookProject.MenuChoiceException.MenuChoiceException;
import PhoneBookProject.MenuViewer.MenuViewer;
import PhoneBookProject.PhoneInfo.PhoneInfo;
import PhoneBookProject.PhoneInfo.PhoneUnivInfo;
import PhoneBookProject.PhoneInfo.PhoneCompanyInfo;

interface INPUT_CHOICE{
	int GEN = 1, UNIV = 2, COMPANY = 3;
}

public class PhoneBookManager {
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	private final File dataFile = new File("PhoneBook.dat");
	
	static PhoneBookManager inst = null;
	
	public static PhoneBookManager createMgrInst(){
		if (inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	private PhoneBookManager(){
		readFromFile();
	}
	
	private void readFromFile(){
		if(dataFile.exists() == false)
			return;
		
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile));
			while(true){
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info == null)
					break;
				infoStorage.add(info);
			}
			in.close();
		}
		catch(IOException e){
			return;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public void writeToFile(){
		try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dataFile));
			
			System.out.printf("writing %d bytes to [%s]\n", dataFile.getTotalSpace(), dataFile.getAbsolutePath());
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext())
				out.writeObject(itr.next());
			out.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void inputData() throws MenuChoiceException{
		System.out.println("1.General 2. University 3.Company");
		System.out.print("Choose Friends Type >> ");
		
		PhoneInfo info = null;
		
		int choice = MenuViewer.sc.nextInt(); MenuViewer.sc.nextLine();
		switch(choice){
		case INPUT_CHOICE.GEN:
			info = readPhoneInfo();
			break;
		case INPUT_CHOICE.UNIV:
			info = readPhoneUnivInfo();
			break;
		case INPUT_CHOICE.COMPANY:
			info = readPhoneCompanyInfo();
			break;
		default:
			throw new MenuChoiceException(choice);
		}
		
		boolean isAdded = infoStorage.add(info);
		if(isAdded)
			System.out.println("input data complete!\n");
		else
			System.out.println("input data already exists!\n");
	}
	
	private PhoneInfo readPhoneInfo(){
		String name, phoneNum;
		System.out.print("input name: "); name = MenuViewer.sc.nextLine();
		System.out.print("input phone: "); phoneNum = MenuViewer.sc.nextLine();
		
		return new PhoneInfo(name, phoneNum);
	}
	
	private PhoneUnivInfo readPhoneUnivInfo(){
		String name, phoneNum, major;
		int gradYear;
		System.out.print("input name: "); name = MenuViewer.sc.nextLine();
		System.out.print("input phone: "); phoneNum = MenuViewer.sc.nextLine();
		System.out.print("input major: "); major = MenuViewer.sc.nextLine();
		System.out.print("input grad year: "); gradYear = MenuViewer.sc.nextInt(); MenuViewer.sc.nextLine();
		
		return new PhoneUnivInfo(name, phoneNum, major, gradYear);
	}
	
	private PhoneCompanyInfo readPhoneCompanyInfo(){
		String name, phoneNum, company;
		System.out.print("input name: "); name = MenuViewer.sc.nextLine();
		System.out.print("input phone: "); phoneNum = MenuViewer.sc.nextLine();
		System.out.print("input company: "); company = MenuViewer.sc.nextLine();
		
		return new PhoneCompanyInfo(name, phoneNum, company);
	}
	
	public String searchData(String name){
		PhoneInfo info = search(name);
		if(info == null)
			return null;
		else
			return info.toString();
	}
	
	private PhoneInfo search(String name){
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()){
			PhoneInfo cmp = itr.next();
			if(name.compareTo(cmp.getName()) == 0)
				return cmp;
		}
		
		return null;
	}
	
	public boolean deleteData(String name){
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()){
			PhoneInfo cmp = itr.next();
			if(name.compareTo(cmp.getName()) == 0){
				itr.remove();
				return true;
			}
		}
		
		return false;
	}
	
	public void showPhoneBookInfo(){
		System.out.println("number of phone list: " + infoStorage.size());
	}
}
