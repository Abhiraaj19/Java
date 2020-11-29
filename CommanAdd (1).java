public class CommanAdd
{
    public static void main(String args[])
    {
     int m=0;
     for(int j=0;j<args.length;j++)
     {
         m=m+Integer.parseInt(args[j]);
     }

      System.out.println("Result is= " + m);
    }
}