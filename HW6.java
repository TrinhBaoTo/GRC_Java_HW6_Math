// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #6, 10/20/19

// This program's behavior is solves quadratic equations and prints their roots.

import java.util.Scanner;

public class HW6
{//open class

   public static void main(String[] args)
   {//open main
     printQuadratic();
   }//end main
   
   public static double x1(int x, int y, int z)
   { //open method to calculates x1
        double no1 = (-y + Math.sqrt(y*y-4*z*x))/(2*x);
        //calculate no1 
        return no1;
   }//end method
   
    public static double x2(int x, int y, int z)
   { //open method to calculates x2    
        double no2 = (-y - Math.sqrt(y*y-4*z*x))/(2*x);
        //calculate no2
        return no2;
            
   }//end method
   
   public static void printQuadratic()
   {//open method
      Scanner coefficients = new Scanner(System.in); //open scanner class
   
      System.out.print("Please type in the coefficient a: ");
      int a = coefficients.nextInt();
      //receive input for coefficient a

      System.out.print("Please type in the coefficient b: ");
      int b = coefficients.nextInt();
      //receive input for coefficient b
   
      System.out.print("Please type in the coefficient c: ");
      int c = coefficients.nextInt();
      //receive input for coefficient c

      double x1 = x1(a, b, c);//call method x1
      double x2 = x2(a, b, c);//call method x2
   
      System.out.println("x1 = "+ x1 +", x2 = "+ x2); 
      //prints values
       
   }//end method
   
}//end class