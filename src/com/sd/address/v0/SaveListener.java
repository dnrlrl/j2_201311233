package com.sd.address.v0;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SaveListener implements ActionListener{
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    AddressGUIMain s=new AddressGUIMain();
    if (cmd.equals("저장")) {
     // String str=s.radiusTf1.getText();
      s.nameLog.append(s.nameTf.getText()+"\n");
      s.addLog.append(s.addTf.getText()+"\n");
    } else if (cmd.equals("삭제")) {
      System.out.println("삭제 버튼");
      b.setText("삭제했습니다");
    } else {
      System.out.println("버튼을 '..했습니다'로 변경하면 cmd도 변경된다.");
    }
  }
}