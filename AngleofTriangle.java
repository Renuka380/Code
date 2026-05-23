/*Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 ? (Angle1 + Angle2).
*/

public class AngleofTriangle
{
public static void main(String[]args)
{
int angle1=50;
int angle2=60;

int ThirdAngle= 180-(angle1+angle2);
System.out.println("ThirdAngle="+ThirdAngle);
}
}