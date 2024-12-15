import java.util.*;
import java.util.Scanner;

interface Vehicles{
	 
	void gearChange();
	void speedUp();
	void applyBrakes();
	
	
}

 class Bicycle implements Vehicles{
	
	 public void gearChange() {
		 System.out.println("Gear changed in Bicycle");
	 }
	 public void speedUp() {
		 System.out.println("speedUp in Bicycle");
	 } public void applyBrakes() {
		 System.out.println("apply Brakes  in Bicycle");
	 }
 }
 
 class Bike implements Vehicles{
	
	 
	 public void gearChange() {
		 System.out.println("Gear changed in Bike");
	 }
	 public void speedUp() {
		 System.out.println("speedUp in Bike");
	 } public void applyBrakes() {
		 System.out.println("apply Brakes  in Bike");
	 }
 }
 
 class Car implements Vehicles{
	 
	 
	 public void gearChange() {
		 System.out.println("Gear changed in Car");
	 }
	 public void speedUp() {
		 System.out.println("speedUp in  Car");
	 } public void applyBrakes() {
		 System.out.println("apply Brakes  in  Car");
	 }
	 
 }


public class Vehicle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		
		do{
			System.out.println("\n********** Choose From below vehicles********** ");
			System.out.println("1.Bicycle. \n2.Bike. \n3. Car. \n4.Exitb");
			System.out.println("Enter Your Choice : ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				     Bicycle b1 = new Bicycle();
				     b1. gearChange();
				     b1. speedUp();
				     b1. applyBrakes();
				     break;
				
			case 2:
				 Bike b2 = new Bike();
			     b2. gearChange();
			     b2. speedUp();
			     b2. applyBrakes();
			     break;
				
			case 3:
				 Car b3 = new Car();
			     b3. gearChange();
			     b3. speedUp();
			     b3. applyBrakes();
			     break;
			
			case 4:
				 System.out.println("Succesfully Exited1");
				   break;
				
			     default:  
			    	 System.out.println("Invalid Choice");
			   break;
			}
			
			
		}while(choice !=4);
		
		
	}
	
	

}