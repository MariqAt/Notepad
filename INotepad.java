package Notepad;

public interface INotepad {

	//make method which adds text to page with number...
	void addTextInPage (String text, int pageNumber);
	
	//make method which removes text and adds new text
	default void removeAndAddNewText (String text, int pageNumber) {
		deleteText(pageNumber);
		addTextInPage(text, pageNumber);
	}
	//make method which delete all text
	void deleteText (int pageNumber);
	
	//make method which show all pages with title and text
	void showInfo ();
		
	void searchWord(String word);
	
	void printAllPagesWithDigits();
}
