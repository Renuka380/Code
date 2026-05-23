/*Question 36: Write a Java program to check whether a character is an alphabet or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If the character lies between A–Z or a–z, it is an alphabet.
Otherwise, it is not.
*/
import java.util.*;
public class Alphabetprg
{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter ch");
char ch=sc.next().charAt(0);

String msg=(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')?"Alphabet":"not an Alphabet";	
System.out.println("msg="+msg);	
	
}
}