package com.sd.address.v1;

import java.awt.*;
import javax.swing.*;

public class AddressGUIMain extends JFrame{
 static JTextField nameTf=new JTextField(20);
 static JTextField addTf=new JTextField(20);
 static JTextField deleteTf=new JTextField(20);
 static JTextArea nameLog = new JTextArea();
 static JTextArea addLog = new JTextArea();
  public static void main(String args[]){
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(6,2,1,1));
    f.getContentPane().add(panel);
    JScrollPane scrollPane = new JScrollPane(nameLog);
    JScrollPane scrollPane2 = new JScrollPane(addLog);
    JLabel label1=new JLabel("이름");
    JLabel label2=new JLabel("주소");
    JLabel label3=new JLabel("이름");
    JLabel label4=new JLabel("주소"); 
    JLabel label6=new JLabel("지울번호");
    JButton b1=new JButton("저장");
    JButton b2=new JButton("삭제");
    //txtLog.setBounds(500,500,500,500);
     //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(new SaveListener());
    b2.addActionListener(new SaveListener());
    panel.add(label1);     
    panel.add(nameTf);
    panel.add(label2);
    panel.add(addTf);
    panel.add(label6);
    panel.add(deleteTf);
    panel.add(b1);
    panel.add(b2);
    panel.add(label3);
    panel.add(label4); 
    panel.add(scrollPane);
    panel.add(scrollPane2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}