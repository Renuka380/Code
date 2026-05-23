/*Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
Input:
Dividend = 20
Divisor = 3

Output:
Quotient = 6
Remainder = 2

Explanation:
The division operator (/) gives the quotient.
The modulus operator (%) gives the remainder.
*/

public class Arithmeticprg
{
public static void main(String[]args)
{
int dividend=20;
int divisor=3;
int quotient=dividend/divisor;
int remainder =dividend%divisor;

System.out.println("Question="+quotient);
System.out.println("Dividend="+dividend);

}
}