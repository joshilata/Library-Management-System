
import java.util.Scanner;
public class MainInformation {
public static void main(String[]args){
	System.out.println("Enter your ISBN");
	Scanner scanner=new Scanner(System.in);
	String str1=scanner.next();
	System.out.println("Enter your name");
	String str2=scanner.next();
	System.out.println("Enter your author");
	String str3=scanner.next();
	System.out.println("Enter your edition");
	String str4=scanner.next();
	
	System.out.println("ISBN"+str1); 
	System.out.println("name"+str2);
	System.out.println("author"+str3);
	System.out.println("edition"+str4);
}


}