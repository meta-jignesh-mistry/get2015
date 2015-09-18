package Presentation;


import java.util.ArrayList;
import java.util.Scanner;

import Business.AuthorQuery;
import Business.BookQuery;
import Business.BookIssueQuery;
import Model.Book;


public class LibraryDemo {
	
	
	static ArrayList<Book> titleList=new ArrayList<Book>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regex="[0-9]+";
		while(true){
		System.out.println("\nPress 1 to show Title Name of Books Published by Any Author ");
		System.out.println("Press 2 to issue book to Any existing member");
		System.out.println("Press 3 to delete the books which are not issued in last one year");
		System.out.println("Press 4 to exit ");
		String choice =sc.next();
		switch(choice){
		
		case "1":
			System.out.println("\nEnter Author's Name ");

			String authorName=sc.next();
		
			//calling of getBookPublishedByAuthor() method
			ArrayList<Book> titleList= AuthorQuery.getBookPublishedByAuthor(authorName);
			System.out.println("TitleId		TitleName	");
			for(Book b:titleList){
			
			
				System.out.println(b.getTitleId()+"          "+b.getTitleName());
			
			}
			
			break;
		
		case "2":
				System.out.println("\nEnter name of Book's Title ");

				String bookName=sc.nextLine();
				bookName=sc.nextLine();
				
				
				String id;
				 do{
					 System.out.println("Enter the member ID");
					 id=sc.next();
				     if(!id.matches(regex)){
				    	 System.out.println("Please enter valid member id\n");
				     }
				     
				   }while(!id.matches(regex));
				
					int memberId=Integer.parseInt(id);
				
				//calling of getStatusOfBookIssue() method
				System.out.println("flag value is  ="+BookIssueQuery.getStatusOfBookIssue(bookName,memberId));
				
				break;
		case "3":
			//calling of toDeleteBooksNotIssuedInLastOneYear() method
			System.out.println("No. of Books Deleted ="+BookQuery.toDeleteBooksNotIssuedInLastOneYear());
			break;
			
		case "4": return;
			default:
				System.out.println("Invalid Input");
		
	
		
		
		}
		
		}
		


	}
	
	
	
}
