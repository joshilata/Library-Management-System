
import java.util.Scanner;
public class MainInformation {
public static void main(String[]args){
	System.out.println("Enter ISBN");
	Scanner scanner=new Scanner(System.in);
	String str1=scanner.next();
	System.out.println("Book title");
	String str2=scanner.next();
	System.out.println("Enter name");
	String str3=scanner.next();
	System.out.println("Enter edition");
	String str4=scanner.next();

	
	System.out.println("ISBN"+str1); 
	System.out.println("title"+str2);
	System.out.println("name"+str3);
	System.out.println("edition"+str4);

}
}