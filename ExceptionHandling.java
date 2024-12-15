
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter the first number:");
			int num1=sc.nextInt();
			
			System.out.println("Enter the Second Number:");
			int num2=sc.nextInt();
			
			System.out.println("Result of division:"+(num1/num2));
			
			//array handling 
			int arr[]= {1,2,3};
			System.out.println("Accessing element that is out of bound"+arr[5]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Error!!Divide by zero is not possible");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error!!Element access is out of bound!!");
			
		}catch(Exception e) {
			System.out.println("Error !!Invalid input");
		}
		finally {
			
			System.out.println("Program Executed!");
		}
		
	}
			
}
