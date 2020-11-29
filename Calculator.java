import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the two number:");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        
        System.out.print("Enter an operator(+,-,*,/):");
        char operator = reader.next().charAt(0);
        
        double result;
        
        switch (operator)
        {
           case'+':
               result = num1 + num2;
               break;
               
           case'-':
               result = num1 - num2;
               break;
           
           case'*':
               result = num1 * num2;
               break;
               
          case'/':
              result = num1 / num2;
              break;
              
          default:
          System.out.printf("Error! operator is not correct");
          return;
          
          
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        
    }
    
}

