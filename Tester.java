/* 
* Purpose: Collect user input and print Fibonacci number
* Author: Madeline Vande Hey
* Date: 4/25/22
*/
import java.util.Scanner;
public class Tester{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer value lower than 47 to calculate the Fibonacci number... enter quit when you're done.");
        String fib = scan.nextLine().toLowerCase();
        while(!fib.equals("quit")){
            int fibNum = Integer.parseInt(fib);
            if(fibNum < 0) System.out.println("Please enter a positive integer...");
            else if(fibNum >= 47) System.out.println("Please enter a value lower than 47...");
            else System.out.println("Fibonacci Number: " + Fibonacci.calcNum(fibNum));
            fib = scan.nextLine().toLowerCase();
        }
        scan.close();
    } 
}