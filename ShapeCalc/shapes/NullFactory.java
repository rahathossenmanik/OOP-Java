package shapecalc.shapes;

import java.awt.Graphics;
import javax.swing.JPanel;
import shapecalc.IShape;

public class NullFactory implements shapecalc.IShapeFactory
{
  private static JPanel _propPnl = new JPanel();
  
  public static final NullFactory Singleton = new NullFactory();
  private static final IShape _nullShape = new IShape() {
    public double getArea() {
      return 0.0D;
    }
    
    public void paint(Graphics g, int x, int y) {}
  };
  
  private NullFactory() {}
  
  public JPanel getPropertyPanel()
  {
    return _propPnl;
  }
  


  public IShape makeShape()
  {
    return _nullShape;
  }
}
