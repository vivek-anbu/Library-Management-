package Library;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static final String RED="\u001B[31m";
    public static final String RESET="\u001B[0m";
    private static Pattern ID_PATTERN = Pattern.compile("^\\d{1,4}$");    // \\d Digit
    private static Pattern AuthorTitle_Pattern=Pattern.compile("^[a-zA-Z ]+$");// ^ Beginning  
    private static Pattern PublishYear_Pattern=Pattern.compile("^\\d{4}$");			// $ End
    private static Pattern Password_Pattern=Pattern.compile("^\\d{5}$");		//{4} At Least 4 Digit
    private static Pattern Email_Pattern=Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
    private static Pattern Username_Pattern=Pattern.compile("^[a-zA-Z]+$");
    Scanner sc = new Scanner(System.in);
    
    public String ValidatePassword()
    {
    	String password;
    	while(true)
    	{
    		System.out.println("Enter Password ");
    		password=sc.nextLine();
    		if(!Password_Pattern.matcher(password).matches())
    		{
    			System.out.println(RED+"Please Enter Valid Password !"+RESET);
    		}
    		else
    		{
    			break;
    		}
    	}
    	return password;
    }
    public String ValidateUserame()
    {
    	String username;
    	while(true)
    	{
    		System.out.println("Enter username");
    		username=sc.nextLine();
    		if(!Username_Pattern.matcher(username).matches())
    		{
    			System.out.println(RED+"Please Enter Valid Useraname !"+RESET);
    		}
    		else
    		{
    			break;
    		}
    	}
    	return username;
    }
    public String ValidateEmail()
    {
    	String emailid;
    	while(true)
    	{
    		System.out.println("Enter EmailId ");
    		emailid=sc.nextLine();
    		if(!Email_Pattern.matcher(emailid).matches())
    		{
    			System.out.println(RED+"Please Enter Valid EmailId !"+RESET);
    		}
    		else
    		{
    			break;
    		}
    	}
    	return emailid;
    }
    
    
    public String validateId() {
        String bookid;
        while (true) {
            System.out.println("Enter Book ID ");
            bookid = sc.nextLine();
            if (!ID_PATTERN.matcher(bookid).matches()) {
                System.out.println(RED+"SORRY ! PLEASE ENTER VALID BOOK ID "+RESET);
            } else {
                break;
            }
        }
        return bookid;
    }
    public String validateAuthorTitle(String input){
        String result;
        while (true){
            if(input=="Title"){
                System.out.println("Enter Title");
            }else{
                System.out.println("Enter Author");
            }
            result=sc.nextLine();
            if(!AuthorTitle_Pattern.matcher(result).matches()){
                System.out.println(RED+"Please Enter Valid "+input+RESET);
            }
            else{
                break;
            }

        }
        return result;
    }
    public String validatePublishYear(){
        String year;
        while(true){
            System.out.println("Enter Publish Year of Book ");
            year=sc.nextLine();
            if(!PublishYear_Pattern.matcher(year).matches()){
                System.out.println(RED+"Enter valid Publish Year"+RESET);
            }
            else{
                break;
            }
        }
        return year;
    }

}





