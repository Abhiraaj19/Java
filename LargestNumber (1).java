import java.util.*;

public class LargestNumber
{
    public static void main(String args[])
    {
      Scanner inp = new Scanner (System.in);
      int num1 = inp.nextInt();
      int num2 = inp.nextInt();
      int num3 = inp.nextInt();
      if(num1>num2 && num1>num3)
      {
          System.out.println("Greatest no : " +num1);
      }
      else if( num2>num1 && num2>num3)
      {
          System.out.println("Greatest no : "+num2);
      }
      else
      {
          System.out.println("Greatest no : "+num3);
      }
    }
    
}