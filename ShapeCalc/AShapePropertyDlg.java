package shapecalc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public abstract class AShapePropertyDlg extends JDialog
{
  public AShapePropertyDlg(javax.swing.JFrame owner, JPanel shapePropPanel)
  {
    super(owner, "Shape Properties", true);
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Cancel");
    JPanel btnPanel = new JPanel();
    
    btnPanel.setLayout(new javax.swing.BoxLayout(btnPanel, 0));
    btnPanel.add(okButton);
    btnPanel.add(cancelButton);
    getContentPane().add(btnPanel, "South");
    getContentPane().add(shapePropPanel, "Center");
    
    okButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        okBtnClick(e);
      }
      
    });
    cancelButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cancelBtnClick(e);
      }
      
    });
    pack();
    setLocationRelativeTo(null);
  }
  
  protected abstract void okBtnClick(ActionEvent paramActionEvent);
  
  protected abstract void cancelBtnClick(ActionEvent paramActionEvent);
}
