package Library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		        Scanner s=new Scanner(System.in);
		          final String BLUE="\u001B[34m";     // color code pattern 
		          final String RESET="\u001B[0m";
		     ServiceBook service=new ServiceBook();
		     int n;
		     System.out.println("Welcome Library Management System");
		       do{
		           System.out.println("1.New User\n"+
		        		  "2.Login\n" 
		           		+ "3.Add Book\n"+
		                   "4.Show All Books\n"+
		                   "5.Show Available Books\n"+
		                   "6.Borrow Book\n"+
		                   "7.Return Book\n"+
		                   "8.Exit\n");

		               System.out.println("Enter Your Choice :");
		               n = s.nextInt();

		           switch (n){
			           			case 1: service.addUser();
			           			break;
			           			case 2:	service.login();
			           			break;
			           			case 3:
			           				service.addBook();
			           				break;
			           			case 4:
			           				service.showAllBooks();
			           				break;
			           			case 5:
			           				service.showAllAvailableBooks();
			           				break;
				               case 6:
				                   service.borrowBook();
				                   break;
				               case 7:
				                   service.returnBook();
				                   break;
				               case 8:
				                   System.out.println(BLUE+"Thank you for Using Application !!"+RESET);
				                   System.exit(0);
				                   break;
				               default:
				                   System.out.println(BLUE+"Please Enter Valid Choice !"+RESET);

		           }
		       }
		       while(n!=8);
		    }
		}

	


