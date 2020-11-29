interface demo
{
    static final double pi=3.14;
    public void disp();
    
}
class Def
{
    int a=19;
    void disp1()
    {
        System.out.println("In disp1 function");
    }
}
class MultipeInherit extends Def implements demo
{
    public void disp()
    {
        System.out.println("In disp function ");
    }
    public static void main(String args[]) 
    {
      MultipeInherit obj = new MultipeInherit ();
      obj.disp1();
      obj.disp();
    }
}