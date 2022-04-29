/*
* Purpose: Calculate Fibonacci number
* Author: Madeline Vande Hey
* Date: 4/25/22
*/
public class Fibonacci{
    public static int calcNum(int n){
        if(n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }

        else if(n > 1){
            return (calcNum(n - 1)) + (calcNum(n - 2));
        }
        else return -1;
    }

}