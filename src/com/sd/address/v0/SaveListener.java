package com.sd.address.v0;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SaveListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    AddressGUIMain s=new AddressGUIMain();
    if (cmd.equals("����")) {
     // String str=s.radiusTf1.getText();
      s.nameLog.append(s.nameTf.getText()+"\n");
      s.addLog.append(s.addTf.getText()+"\n");
    } else if (cmd.equals("����")) {
      System.out.println("���� ��ư");
      b.setText("�����߽��ϴ�");
    } else {
      System.out.println("��ư�� '..�߽��ϴ�'�� �����ϸ� cmd�� ����ȴ�.");
    }
  }
}