package main;
import java.util.Scanner;
class ArmstrongNumber{
   @SuppressWarnings("resource")
   public static void main(String args[]){
      int number, temp, remainder, digits = 0;
	double sum = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Input a number to check if it is an Armstrong number");      
      number = in.nextInt();
      temp = number;
     
      // Count number of digits
      while (temp != 0) {
         digits++;
         temp = temp/10;
      }
      temp = number;
 
      while (temp != 0) {
         remainder = temp%10;
         sum = sum + Math.pow(remainder, digits);
         temp = temp/10;
      }
 
      if (number == sum)System.out.println(number + " is an Armstrong number.");
      else System.out.println(number + " isn't an Armstrong number.");        
   }
}