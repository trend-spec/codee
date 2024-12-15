import java.util.Scanner;
  
 abstract class shape {
	     double  width;
	     double length;
	     
	     void input() {
	    	 Scanner sc =new Scanner(System.in);
	    	 
	    	 System.out.println("Enter the width");
	    	 width = sc.nextDouble();
	    	 
	    	 System.out.println("Enter the lenght");
	    	 length = sc.nextDouble();
	    	 
	    	 
	     }
	     
	    abstract void compute_area();
	  
	 
 }
    
   
     class triangle extends shape{
    	 
    	  void compute_area() {
    		 
    		  double area;
    		  area = width*length*1/2;
    		  System.out.println("Area of triangle :"+width+"*"+length+"*1/2="+area);
    	 }
     }

     class rectangle extends shape{
    	 
   	  void compute_area() {
   		 
   		  double area;
   		  area = width*length;
   		  System.out.println("Area of reactangle :" +width+ "*"+length+"="+area);
   	 }
    }

public class ComputeArea {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			
			System.out.println("*choose from below*");
			System.out.println("1.Triamgle    \n2rectangle    \n4 Exit");
			System.out.println("Enter your choice :");
			choice =sc.nextInt();
			
			switch(choice) {
			
			
			case 1:   shape T = new triangle();
			           T.input();
			           T.compute_area();
			           break;
			           
			case 2 :   shape b = new  rectangle();
	           b.input();
	           b.compute_area();
	           break;          
			
			case 3:
				System.out.println("Successfully exit ");
				break;
				
				default:
					System.out.println(" re enter the choice  ");
					break;
	           
			
			}
			
			
		}while(choice !=3);
	}

}