public class Constructor
{
    int n1,n2;
    Constructor ()
    {
        n1=18;
        n2=19;
    }
    Constructor(int x)
    {
        n1=x;
    }
    Constructor(int x,int y)
    {
        n1=x;
        n2=y;
    }
    public void display()
    {
        System.out.println("Value1 = "+n1);
        System.out.println("Value2 = "+n2);
    }
    public static void main(String args[])
    {
        Constructor d1 = new Constructor();
        Constructor d2 = new Constructor(20);
        Constructor d3 = new Constructor (20,30);
        System.out.println("Inside default Constructor");
        d1.display();
        System.out.println("Inside parameterized Constructor1");
        d2.display();
        System.out.println("Inside parameterized Constructor2");
        d3.display();
    }
}