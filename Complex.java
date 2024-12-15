import java.util.Scanner;


public class Complex {
	
	  private int real;
	  private int img ;
	  
	      public Complex() {
	    	  real=0;
	    	  img=0;
	      }    
	                
	        public Complex(int real,int img) {
	        	  this.real=real;
	        	  this.img=img;
	        }
	        
	        
	          public void add(Complex c1,Complex c2) {
	        	  
	        	   real=c1.real+c2.real;
	        	   img=c1.img+c2.img;
	        	   
	        	   System.out.println("Addition :"+""+real+""+img);
	        	   
	        	  
	        	  
	          }
	          
	          public void sub(Complex c1,Complex c2) {
	        	  
	        	   real=c1.real-c2.real;
	        	   img=c1.img-c2.img;
	        	   
	        	   System.out.println("Subtraction :"+""+real+""+img);
	        	   
	        	  
	        	  
	          }
	          
	          
	          public void mul(Complex c1,Complex c2) {
	        	  
	        	   real=c1.real*c2.real+ c1.img*c2.img    ;
	        	   img=c1.real* c2.img+c1.img*c2.real;
	        	   
	       System.out.println("Multiplication :"+""+real+""+img);
	        	   
	        	  
	        	  
	          }
	          
	          public void div(Complex c1,Complex c2) {
	        	  
	        	   real=c1.real/c2.real   ;
	        	   img=c1.img/c2.img;
	        	   
	       System.out.println("Multiplication :"+""+real+""+img);
	        	   
	        	  
	        	  
	          }
	
	

	public static void main(String[] args) {
		
       
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println(" enter the real part of complex no 1");
		int real1=sc.nextInt();
		
		 System.out.println(" enter the img part of complex no 1");
			int img1=sc.nextInt();
		
			 System.out.println(" enter the real part of complex no 2");
				int real2=sc.nextInt();
				
				 System.out.println(" enter the img part of complex no 2");
					int img2=sc.nextInt();
				
					
				Complex c1=new Complex(real1,img1);	
				Complex c2=new Complex(real2,img2);	
					
					Complex c3 = new Complex();
					
					c3.add(c1, c2);
					c3.sub(c1, c2);
					c3.mul(c1, c2);
					c3.div(c1, c2);
					
					
					
					
					
				
				
	}

}