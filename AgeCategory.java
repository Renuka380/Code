/*Question 36: Check if a person is a child, teenager, adult, or senior based on age.

   Input: Age
   Logic: if-else if
   Output: Age category.
Input:
Age = 16

Output
Teenager

Explanation:
Age < 13 ? Child
13–19 ? Teenager
20–59 ? Adult
60+ ? Senior
*/
import java.util.*;
public class AgeCategory
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		if(age<13)
		{
		System.out.println("age category is child");	
		}
		else if(19>=age)
		{
			System.out.println("age category is Teenager");
		}
		else if(59>=age)
		{
			System.out.println("age category is Adult");
		}
		else if(age>60){
			System.out.println("age category is senior");
		}
		
	}
}







