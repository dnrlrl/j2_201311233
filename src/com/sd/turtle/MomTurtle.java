package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;
import java.awt.Color;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public MomTurtle(){
    setColor(Color.red);
    System.out.println("Mom turtle is Red");
  }
  public void update(Observable o, Object arg){
    babyCurpos=((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
  }
}
  