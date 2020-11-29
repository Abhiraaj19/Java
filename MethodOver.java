public class MethodOver
{
    double result;
    double area(int n1)
    {
        result=3.14*n1*n1;
        return result;
    }
    double area(int n1,int n2)
    {
        result=n1*n2;
        return result;
    }
    double area(int n1,int n2,int n3)
    {
        result=n1*n2*n3;
        return result;
    }
    public static void main(String[] args)
    {
        MethodOver m1 = new MethodOver();
        double n1,n2,n3;
        n1=m1.area(2);
        System.out.println("Area of circle is:"+n1);
        n2=m1.area(2,3);
        System.out.println("Area of rectangle is:"+n2);
        n3=m1.area(2,3,4);
        System.out.println("Volume of cuboid is:"+n3);
    }
}