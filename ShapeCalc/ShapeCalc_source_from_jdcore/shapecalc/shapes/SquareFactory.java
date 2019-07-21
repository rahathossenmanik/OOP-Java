package shapecalc.shapes;

import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SquareFactory implements shapecalc.IShapeFactory
{
  private static javax.swing.JTextField _sideTF = new javax.swing.JTextField("0.0");
  private static JPanel _propPnl = new JPanel();
  
  public static final SquareFactory Singleton = new SquareFactory();
  
  private SquareFactory() { _propPnl.setLayout(new javax.swing.BoxLayout(_propPnl, 1));
    _propPnl.add(new javax.swing.JLabel("Side:"));
    _propPnl.add(_sideTF);
  }
  
  public JPanel getPropertyPanel() {
    return _propPnl;
  }
  

  public shapecalc.IShape makeShape()
  {
    try
    {
      new shapecalc.IShape() {
        private double _side = Double.parseDouble(SquareFactory._sideTF.getText());
        
        public double getArea() {
          return _side * _side;
        }
        
        public void paint(Graphics g, int x, int y) {
          g.drawRect(x - (int)_side / 2, y - (int)_side / 2, (int)_side, (int)_side);
        }
      };
    }
    catch (Exception parseError) {
      _sideTF.setText("0.0"); }
    return makeShape();
  }
}
