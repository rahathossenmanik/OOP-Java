package shapecalc;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import shapecalc.shapes.NullFactory;

public class ShapeCalc extends AFrame
{
  private IShape _shape = NullFactory.Singleton.makeShape();
  
  public ShapeCalc(String title) {
    super(title);
  }
  
  protected void initialize() {
    setSize(400, 400);
    setLocationRelativeTo(null);
    JPanel ctrlPnl = new JPanel();
    JLabel areaLbl = new JLabel("Area: ???");
    JTextField shapeTF = new JTextField("shapecalc.shapes.SquareFactory");
    javax.swing.JButton newBtn = new javax.swing.JButton("New...");
    
    JPanel drawPnl = new JPanel() {
      public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        _shape.paint(g, getSizewidth / 2, getSizeheight / 2);
      }
      
    };
    Container cp = getContentPane();
    cp.add(ctrlPnl, "North");
    cp.add(drawPnl, "Center");
    cp.add(areaLbl, "South");
    ctrlPnl.add(shapeTF);
    ctrlPnl.add(newBtn);
    newBtn.addActionListener(new java.awt.event.ActionListener() { private final JTextField val$shapeTF;
      
      public void actionPerformed(java.awt.event.ActionEvent e) { IShapeFactory sf = ShapeCalc.this.getFactory(val$shapeTF.getText());
        new ShapeCalc.3(this, ShapeCalc.this, sf.getPropertyPanel(), sf).setVisible(true);
        









        val$areaLbl.setText("Area: " + _shape.getArea());
        repaint();
      }
    });
  }
  



  private final JLabel val$areaLbl;
  

  private IShapeFactory getFactory(String shapeName)
  {
    try
    {
      java.lang.reflect.Field f = Class.forName(shapeName).getField("Singleton");
      
      return (IShapeFactory)f.get(null);
    }
    catch (Exception e)
    {
      System.err.println(e); }
    return NullFactory.Singleton;
  }
}
