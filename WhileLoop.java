/*3.	Write a program WhileLoop.java that uses while loop to perform the following steps:
1.	Prompttheusertoinputtwopositiveintegers:firstNumandsecondNum(firstNummustbesmaller
2.	thansecondNum).
1.	Prompt the user to input two positive integers: firstNum and secondNum (firstNum must be smaller than secondNum).
2.	Output all the even numbers between firstNum and secondNum inclusive.
3.	Output the sum of all the even numbers between firstNum and secondNum inclusive.
4.	Output all the odd numbers between firstNum and secondNum inclusive.
5.	Output the sum of all the odd numbers between firstNum and secondNum inclusive.
*/
import java.util.Scanner;
class WhileLoop 
{
    public static void main(String[] args) 
	{
    
        int n = 20;
        int n1= 7;
        int EvenSum=0;
        int Oddsum =0;
        while(n1<=n)
		{
            if(n1%2==0)
			{
                System.out.print("Even Number: "+n1+"  ");
                EvenSum+=n1;
            }
            else{
                System.out.println("Odd Number : "+n1+"  ");
                Oddsum+=n1;
            }
            n1++;
        }
        System.out.println("Sum of Even Nunmber : "+EvenSum);
        System.out.println("Sum of Odd Nunmber : "+Oddsum);
    }
}