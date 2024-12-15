import java.util.Scanner;

   class publication{
	     String Title;
	     float price;
	     int copies;
	   
	      void saleCopy() {
	    	  
	    	  System.out.println("  saleCopy() of the publication     ");
	      }
   }

   class Book{
	   String Title,Author;
	     float price;
	     int copies;
	   
	     Scanner sc = new Scanner(System.in);
	    void displayBookDetails(){
	    	 Title = "Army Officer ";
	    	 Author="Sujal";
	    	 price=200.00f;
	    	 
	    	 System.out.println(" Title:  "+Title);
	    	 System.out.println(" Author: "+Author);
	    	 System.out.println(" price:  "+ price);
	    }
	     
	      void orderCopies() {
	    	  System.out.println("How many copies you want to order ");
	    	  copies =sc.nextInt();
	    	  
	      }
	    
	    
	     void saleCopy() {
	    	  
	    	  System.out.println(" Total sale: "+price*copies);
	      }
	     
   }

  class Magazine{
	  String Title;
	     float price;
	     int copies;
	  
	     void saleCopy() {
	    	  
	    	  System.out.println("  saleCopy() of the Magazine     ");
	      }
	     
	     void ordQty() {
	    	 
	    	 System.out.println("  ordQty() of the Magazine     ");
	     }
  }



public class PublicationBook {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {    
			System.out.println("*choose from below*");
			System.out.println("1.publication    \n2Book     \n3Magazine    \n4 Exit");
			System.out.println("Enter your choice :");
			choice =sc.nextInt();
			
			switch(choice) {
			

			case 1:
				 publication b1 =new publication();
				 b1.saleCopy();
				 break;
				 
				 
			case 2:
				Book b2 =new Book();
				b2.displayBookDetails();
				b2.orderCopies();
				b2.saleCopy();
				break;
				
			case 3:
				Magazine b3 = new  Magazine();
				b3.ordQty();
				b3.saleCopy();
				break;
				
			case 4:
				System.out.println("Succesfully exited ");
				 break;
				 
				 
			 default:
				 System.out.println(" enter the correcot choice ");
				 break;
			}

		}while(choice !=4);

	}

}