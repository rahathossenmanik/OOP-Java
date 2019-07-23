package shapecalc.shapes;

import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JButton;

public class CircleFactory implements shapecalc.IShapeFactory
{
  private static javax.swing.JTextField _radTF = new javax.swing.JTextField("0.0");
  private static java.awt.Color _selectedColor = java.awt.Color.blue;
  private static javax.swing.JPanel _propPnl = new javax.swing.JPanel();
  
  public static final CircleFactory Singleton = new CircleFactory();
  
  private CircleFactory() { _propPnl.setLayout(new javax.swing.BoxLayout(_propPnl, 1));
    _propPnl.add(new javax.swing.JLabel("Radius:"));
    _propPnl.add(_radTF);
    _propPnl.add(new javax.swing.JLabel("Color:"));
    JButton colorBtn = new JButton("Color...");
    colorBtn.setBackground(_selectedColor);
    _propPnl.add(colorBtn);
    colorBtn.addActionListener(new java.awt.event.ActionListener() { private final JButton val$colorBtn;
      
      public void actionPerformed(java.awt.event.ActionEvent e) { CircleFactory.access$002(javax.swing.JColorChooser.showDialog(CircleFactory._propPnl, "Pick a color", CircleFactory._selectedColor));
        val$colorBtn.setBackground(CircleFactory._selectedColor);
      }
    });
  }
  
  public javax.swing.JPanel getPropertyPanel() {
    return _propPnl;
  }
  
  public shapecalc.IShape makeShape()
  {
    try
    {
      new shapecalc.IShape() {
        private double _rad = Double.parseDouble(CircleFactory._radTF.getText());
        private java.awt.Color _color = CircleFactory._selectedColor;
        
        public double getArea() { return 3.141592653589793D * _rad * _rad; }
        
        public void paint(Graphics g, int x, int y)
        {
          java.awt.Color oldColor = g.getColor();
          g.setColor(_color);
          g.fillOval(x - (int)_rad / 2, y - (int)_rad / 2, (int)_rad, (int)_rad);
          g.setColor(oldColor);
        }
      };
    }
    catch (Exception parseError) {
      _radTF.setText("0.0"); }
    return makeShape();
  }
}
