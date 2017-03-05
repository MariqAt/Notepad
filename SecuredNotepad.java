package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	
	private String password;
	
	public SecuredNotepad(String name, int numberPages, String password) throws Exception {
		super(name, numberPages);
		int counterDownLetter = 0;
		int counterUpLetter = 0;
		int countMinDigit = 0;
		if (password.length() >= 5) {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					countMinDigit++;
				} 
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
					counterDownLetter++;
				}
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
					counterUpLetter++;
				}
			}
			if (counterDownLetter >= 1 && counterUpLetter >= 1 && countMinDigit >= 1) {
				this.password = password;
			} else {
				throw new Exception ("The password is weak!");
			}
		} else {
			throw new Exception ("The password is weak!");
		}
	}

	public boolean checkPassword () {
		boolean isTruePassword = false;
		while (!isTruePassword) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please, enter a password: ");
			String password1 = sc.nextLine();
			if (this.password.equals(password1)) {
				isTruePassword = true;
			} else {
				System.out.println("Enter password is wrong!");
			}
		}
			return isTruePassword;
	}
	
	@Override
	public void addPage(Page page) {
		if (checkPassword()) {
			super.addPage(page);
		}
	}

	@Override
	public void addTextInPage(String text, int pageNumber) {
		if (checkPassword()) {
			super.addTextInPage(text, pageNumber);
		} 
	}

	@Override
	public void deleteText(int pageNumber) {
		if (checkPassword()) {
			super.deleteText(pageNumber);
		} 
	}

	@Override
	public void showInfo() {
		if (checkPassword()) {
			super.showInfo();
		}
	}
	

}
