import java.awt.*;

class Login 
{
   public static void main(String args[])
{
       Frame f=new Frame();
       f.setLayout(new FlowLayout());
       f.setVisible(true);
         f.setSize(1500,1500);
          f.setTitle("My Login Page");
          f.setBackground(Color.blue);
         Label a1=new Label("User Name");
         Label a2=new Label("Password");
         TextField t1=new TextField(15);
           TextField t2=new TextField(15);
            t2.setEchoChar('*');
            Button b=new Button("Log in");

            


              f.add(a1);
 f.add(t1);
 f.add(a2);
 f.add(t2);
f.add(b);

}
}
