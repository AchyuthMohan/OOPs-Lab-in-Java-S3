import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b;
    Container c;
    Frame(){
        c = getContentPane();
        c.setLayout(null);

        l1=new JLabel("Real String: ");
        l1.setBounds(100,25,100,50);
        c.add(l1);

        l2=new JLabel("Reversed: ");
        l2.setBounds(100,50,100,50);
        c.add(l2);

        b=new JButton("REVERSE");
        b.addActionListener(this);
        b.setBounds(50,100,100,50);
        c.add(b);

        t1=new JTextField();
        t1.setBounds(100,25,100,25);
        c.add(t1);

        t2=new JTextField();
        t2.setBounds(100, 10, 100,25);
        c.add(t2);


    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s=="REVERSE"){
            String s1=t1.getText();
            System.out.println(s1);
            String s2="";
            for(int i=s1.length()-1;i>=0;i--){
                s2+=s1.charAt(i);
            }
            t2.setText(s2);
            System.out.println(s2);
        }
    }

    

}
class Myswing{
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("My Swing");
        f.setVisible(true);
        f.setSize(400,400);
    }
    
}