package org.Inheritance;
public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }


    
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }



    
    public void setSide(double side) {
        setLength(side); 
        setWidth(side);  
    }

    public double getSide() {
        return getLength(); 
    }


    @Override
    public String toString() {
        return "Square with side = " + getSide() +
                " is a subclass of " + super.toString();
    }
}
