public class sum
{
    public static void main(String args[]) 
    {
      int j=0,sum=0;
     
     do
     
     {
         sum = sum + j;
         j=j+2;
     }
    while(j<=20);
     
      System.out.println("Sum of the first 10 even number is "+sum);
    }
}