import java.awt.*;
import java.awt.event.*;
class house extends Frame 
{

    house()
    {

        this.addWindowListener(new WindowAdapter()
{
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });

    }
 public void paint(Graphics g)
 {
    //house base
      g.setColor(Color.RED);
 g.fillRect(550,550,600,300);
     g.drawRect(550,550,600,300);
    
     //roof
     int x[] = {550,850,1150};
     int y[] = {550,350,550};
     g.drawPolygon(x,y,3);
g.setColor(Color.BLUE);
g.fillPolygon(x,y,3);
    
     //roof window
     g.drawOval(800,420,100,100);
g.setColor(Color.YELLOW);
 g.fillOval(800,420,100,100);
    
     //door
     g.drawRect(850,700,120,150);
    
     //door nob
     g.drawOval(850,770,10,10);

    
     //window in base
     g.drawRect(600,620,75,75);
    
     //window bar
     g.drawLine(600,665,675,665);
     g.drawLine(645,620,645,695);
    
     //chimney
     int a[] = {1000,1000,1050,1050};
     int b[] = {450,350,350,484};
     g.drawPolygon(a,b,4); 
     g.setColor(Color.BLACK);
     g.fillPolygon(a,b,4 );
    
     //sun in the sky
    g.setColor(Color.YELLOW);
    g.drawOval(50,50,100,100);
    g.setColor(Color.YELLOW);
    g.fillOval(50,50,100,100);
    g.drawLine(50,50,20,20);
    g.setColor(Color.YELLOW);
    g.drawLine(150,150,180,180);
    g.drawLine(150,50,180,20);
    g.drawLine(50,150,20,180);
    g.drawLine(30,100,-10,100);
    g.drawLine(100,30,100,-10);
    g.drawLine(170,100,210,100);
    g.drawLine(100,170,100,210);



 }   
 public void IndexOutOfBoundsException(String s)
{

}

 public static void main(String arg[]) {
    
    house H = new house();
      H.setSize(1500,1500);
    H.setTitle("My House");
    H.setVisible(true);
   }
}
