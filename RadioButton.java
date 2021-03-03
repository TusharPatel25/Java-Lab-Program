import javax.swing.*;    
public class RadioButton{    
JFrame f;    
RadioButton(){    
f=new JFrame();     
JRadioButton r1=new JRadioButton("Male");    
JRadioButton r2=new JRadioButton("Female");    
r1.setBounds(75,50,100,30);    
r2.setBounds(75,100,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
f.add(r1);f.add(r2);      
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true); 
f.setTitle("Radio Button");  

}    
public static void main(String[] args) {    
    new RadioButton();    
}    
}    
