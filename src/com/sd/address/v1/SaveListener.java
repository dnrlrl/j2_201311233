package com.sd.address.v1;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.List;
import java.util.Iterator;

public class SaveListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person = new PersonVO();
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    AddressGUIMain s=new AddressGUIMain();
    if (cmd.equals("����")) {
     // String str=s.radiusTf1.getText();
      person.setName(s.nameTf.getText());
      person.setAddress(s.addTf.getText());
      personDAOImpl.insert(person);
      s.nameLog.append(s.nameTf.getText()+"\n");
      s.addLog.append(s.addTf.getText()+"\n");
    } else if (cmd.equals("����")) {
      int i=Integer.parseInt(s.deleteTf.getText());
      //s.deleteTf.getText()
      personDAOImpl.delete(i);
    } else {
      System.out.println("��ư�� '..�߽��ϴ�'�� �����ϸ� cmd�� ����ȴ�.");
    }
  }
}
