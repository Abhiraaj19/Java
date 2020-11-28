 import java.util.Scanner;
 public class Marks
{
    public static void main(String args[])
    {
     int marks;
     System.out.println("Enter the Mark's obtained");
     Scanner scan= new Scanner(System.in);
     marks=scan.nextInt();
     if (marks>40)
    
     {
       System.out.println("Student pass");
     }
     else
     {
         System.out.println("Student fail");
     }
    }
}