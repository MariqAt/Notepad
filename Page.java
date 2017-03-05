package Notepad;

public class Page {

	private String title;
	private String text;
	private static int counter = 1;
	
	//make constructor
	public Page(String title, String text) {
		if (title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			this.title = "Page " + this.counter;
			this.counter++;
		}
		if (text.length() > 0) {
			this.text = text;
		}
	}
	//make method which add text
	public void addText (String text) {
		if (text.length() > 0) {
			if (this.text != null) {
				this.text = this.text.concat(text + " ");
			} else {
				this.text = text;
			}
		}
	}
	//make method which removes text 
	public void removeText () {
		this.text = "";
	}
	//make method which show info for title and text
	@Override
	public String toString() {
		return "[title=" + title + ", text=" + text + "]";
	}
	public String getTitle() {
		return title;
	}
	
	//make method which search word in text
	public boolean searchWord (String word) {
		if (this.text.contains(word)) {
			return true;
		}
		return false;
	}
	
	public boolean containsDigits () {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
}
