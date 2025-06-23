import java.util.*;

public class Console_Calculator 
  {
     public static double addition(double a,double b)
     {
    	 return a+b;
     }
     public static double substraction(double a,double b)
     {
    	 return a-b;
     }
     public static double multiplication(double a,double b)
     {
    	 return a*b;
     }
     public static double division(double a,double b)
     {
    	 if(b==0)
    	 {
    		 System.out.println("Error: Can't divide by 0");
    		 return Double.NaN;
    	 }
    	 return a/b;
     }
     public static void main(String[] args) 
     {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Please choose any number between(1-5)");
			System.out.println("1. Addition(+)");
			System.out.println("2. Substraction(-)");
			System.out.println("3. Multiplication(*)");
			System.out.println("4. Division(/)");
			System.out.println("5. Exit.");
			
			System.out.println("Enter your choice: ");
			int n=sc.nextInt();
			
			switch(n)
			{
			case 1:    System.out.println("Enter two values(a,b): ");    
				       System.out.println("Addition is: " + addition(sc.nextDouble(),sc.nextDouble()));
				       break;
				
			case 2:    System.out.println("Enter two values(a,b): ");    
			           System.out.println("Substraction is: " + substraction(sc.nextDouble(),sc.nextDouble()));
		               break;
		                         
			case 3:    System.out.println("Enter two values(a,b): ");    
			           System.out.println("Multiplication is: " + multiplication(sc.nextDouble(),sc.nextDouble()));
                       break;
                       
			case 4:    System.out.println("Enter two values(a,b): ");    
			           System.out.println("Division is: " + division(sc.nextDouble(),sc.nextDouble()));
                       break;
                       
			case 5:    System.out.println("Thank you for using Calculator.");
			           System.exit(0);
                       
			default:   System.out.println("Oops! Wrong Input\nPlease Enter valid Input(1-5).");
         
			}
		}
	 }
  }