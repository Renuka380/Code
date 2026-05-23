/*Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5
Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0
*/
import java.util.*;

public class Arithmatic
{
public static void main (String[]x)
{
Scanner xyz= new Scanner(System.in);
int num1=xyz.nextInt();
System.out.println("Enter Number1; ");

int num2=xyz.nextInt();
System.out.println("Enter Number2; ");

int add=num1+num2;
int sub=num1-num2;
int mul=num1*num2;
int div=num1/num2;
int mod=num1%num2;


System.out.println("Addition="+add);
System.out.println("Subtraction="+sub);
System.out.println("Multiplication="+mul);
System.out.println("Division="+div);
System.out.println("Modulus="+mod);

}
}
