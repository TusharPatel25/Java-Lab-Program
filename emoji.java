import javax.swing.*;
import java.awt.*;
class Smiley extends JPanel
{
    
    public static void main(String args[])
    {
        //Create a frame
        JFrame frame=new JFrame("Smiley");
        frame.setSize(1500,1500);
        frame.setBackground(Color.white); 
        Smiley panel=new Smiley();
        frame.add(panel);
        //Set default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    //function to draw the shapes
    public void paint(Graphics g)
    {
        //Change color to yellow
        g.setColor(Color.yellow);
        //Draw and fill the face
        g.drawArc(500,200,500,500,0,360);
        g.fillArc(500,200,500,500,0,360);
        //Change color to black
        g.setColor(Color.black);
        //Draw the left eye
        g.drawArc(600,350,50,50,0,360);
        g.fillArc(600,350,50,50,0,360);
        //Draw the right eye
        g.drawArc(825,350,50,50,0,360);
        g.fillArc(825,350,50,50,0,360);
        //Draw the smile
        g.drawArc(660,470,190,100,0,-180);
    }
}
