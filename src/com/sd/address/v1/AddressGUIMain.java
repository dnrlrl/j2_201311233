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
    JLabel label1=new JLabel("�̸�");
    JLabel label2=new JLabel("�ּ�");
    JLabel label3=new JLabel("�̸�");
    JLabel label4=new JLabel("�ּ�"); 
    JLabel label6=new JLabel("�����ȣ");
    JButton b1=new JButton("����");
    JButton b2=new JButton("����");
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