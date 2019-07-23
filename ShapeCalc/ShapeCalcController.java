package shapecalc;

import java.awt.Container;

public class ShapeCalcController {
  private ShapeCalc _shapeCalc;
  
  public ShapeCalcController() {
    _shapeCalc = new ShapeCalc("Shape Calculator");
    _shapeCalc.validate();
    _shapeCalc.setVisible(true);
  }
  
  public static void main(String[] args)
  {
    new ShapeCalcController();
  }
}
