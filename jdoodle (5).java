//hello world applet program
//HTML CODE
/*
    <title> Test Applet page </title>
    <body>
      <applet code = Hello world.class w=100 h=100
      </applet>1
*/
import java.awt.Graphics;
  import java.applet.Applet;
  
   public class Helloword extends Applet 
   {
       public void paint(Graphics g)
       {g.drawString("hello world!",10,10);
   }
   
}