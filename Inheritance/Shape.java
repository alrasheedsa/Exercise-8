package org.Inheritance;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){

    }
    public Shape(String color, boolean filled) {
        this.color = "green";
        this.filled = true;
    }




    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        return "Shape Color " + color + " and " + (filled ? "filled" : "Not filled");
    }


}
