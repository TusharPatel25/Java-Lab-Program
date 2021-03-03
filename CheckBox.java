import javax.swing.*;  
public class CheckBox 
{  
     CheckBox(){  
        JFrame f= new JFrame("My Checkbox Example ");  
        JCheckBox checkBox1 = new JCheckBox("JAVA");  
        checkBox1.setBounds(100,100, 70,70);  
        JCheckBox checkBox2 = new JCheckBox("PYTHON", true);  
        checkBox2.setBounds(100,150, 80,80);  
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
     }  
public static void main(String args[])  
    {  
    new CheckBox();  
    }}  
