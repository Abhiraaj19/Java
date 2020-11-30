import java.util.Scanner;
public class String
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = inp.nextLine();
        System.out.print("Enter string s1: ");
        String s1 = inp.nextLine();
        System.out.println(s.equals(s1));
        
        System.out.print("Enter string s2: ");
        String s2 = inp.nextLine();
        System.out.print("Enter string s3: ");
        string s3 = inp.nextLine();
        System.out.print("Concated String: ");
        System.out.println(s2.concat(s3));
        
        System.out.print("Lowercase string: ");
        System.out.println(s2.tolowerCase());
        
        System.out.print("Uppercase string: ");
        System.out.println(s3.toUppercase());
        
        System.out.print("Enter string s4: ");
        String s4 = inp.nextLine();
        System.out.println("Is the string Empty?");
        System.out.println(s4.isEmpty());
        
    }
}
