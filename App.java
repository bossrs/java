import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.net.*;
import java.awt.event.*; 
import java.awt.*;

public class App {
    public static void main(String[] args) {
       JFrame f = new JFrame("IP ADDRESS");
           
         JLabel l = new JLabel("Enter the website:");
             l.setBounds(30,50,200,20);
             
             JTextField tf = new JTextField();
             tf.setBounds(155,50,200,20);
             JButton b = new JButton("find ip");
             b.setBounds(180,100,150,30);
             JLabel l2 = new JLabel();
            l2.setBounds(50,200,300,20);
            ImageIcon image = new ImageIcon("D:\\subash\\ip\\src\\ip.png");
            f.setIconImage(image.getImage());
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                String host = tf.getText();
                
                String ip = InetAddress.getByName(host).getHostAddress();
                l2.setText("Ip address of this website is : "+ip); 
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });
       f.add(l);
       f.add(tf);
       f.add(b);

       f.add(l2);
       f.setSize(500,300);
       f.getContentPane().setBackground(new Color(255,153,0));
       f.setLayout(null);
       f.setVisible(true);
       f.setResizable(false);;
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
       
    }
}
