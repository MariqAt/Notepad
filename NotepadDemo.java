package Notepad;


public class NotepadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SimpleNotepad contract = new SimpleNotepad("Contracts", 4);
		contract.addPage(new Page("Custumer", "PC Netcom, Victory Entertainment"));
		contract.addPage(new Page("Suppliers", "Polymax, DarisDisc"));
		contract.addPage(new Page("Stuff", "Kiril Andonov, Greta Zdravkova, Dinka Petrova"));
		contract.addPage(new Page("Institutions", "OBB, Municipality Sofiq"));
		contract.showInfo();
		System.out.println();
		
		contract.deleteText(3);
		contract.addTextInPage("DSK", 3);
		contract.showInfo();
		
		System.out.println();
		Page page1 = new Page("knigi", "ad; puklena kruv; monahut, koito prodade svoeto ferari; 50 nuansa sivo ");
		System.out.println("Is there word 'prodade': " + page1.searchWord("prodade"));
		System.out.println("Is there digits: " + page1.containsDigits());
		System.out.println();
		
		ElectronicSecuredNotepad diary = new ElectronicSecuredNotepad("Diary", 10, "PassW0rd123");
		diary.start();
		diary.addPage(new Page("Stihotvoreniq", "Na proshtavane; Maicisi;"));
		diary.addPage(new Page("Knigi", "1.Ne pipai tazi kniga; 2.Lubov; 3.Tsigylkata na Veneciq"));
		diary.addPage(new Page("Filmi", "1.Titanik; 2.Avatar; 3.Games of thrones"));
		diary.addPage(new Page("Stilove myzika", "hip-hop, classica, pop, rap"));
		diary.printAllPagesWithDigits();
		diary.showInfo();
		diary.deleteText(2);
		diary.addTextInPage("1. Priqteli; 2. Velikata stena; 3. Padnaliq angel ", 2);
		diary.removeAndAddNewText("1. Zahir; 2. Bez dom; 3. Da precakash dqvola", 1);
		diary.showInfo();
		diary.stop();
		
		System.out.println();
		diary.addTextInPage(" 1. Rege, 2. Latino", 3);
		diary.printAllPagesWithDigits();
		
		SecuredNotepad notepad = new SecuredNotepad("Notepad", 3, "pass12");
		
	}

}
