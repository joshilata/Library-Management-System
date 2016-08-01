
public class BookDisplay {
 
private String ISBN;
private String title;
private String author;
private String edition;
private int price;

public BookDisplay(String iSBN, String title, String author, String edition, int price) {
	super();
	
	ISBN = iSBN;
	this.title = title;
	this.author = author;
	this.edition = edition;
	this.price = price;
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
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getEdition() {
	return edition;
}

public void setEdition(String edition) {
	this.edition = edition;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
 

}
