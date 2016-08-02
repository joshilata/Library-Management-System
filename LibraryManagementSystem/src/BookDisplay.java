
public class BookDisplay {
 
private String ISBN;
private String title;
private String name;
private String edition;



public BookDisplay(String iSBN, String title, String author, String edition, String categories) {
	super();
	
	ISBN = iSBN;
	this.title = title;
	this.name = name;
	this.edition = edition;
	
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return name;
}

public void setAuthor(String author) {
	this.name = name;
}

public String getEdition() {
	return edition;
}

public void setEdition(String edition) {
	this.edition = edition;
}


}
