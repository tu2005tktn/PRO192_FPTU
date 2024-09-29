//@author Nguyen Van Tu HE194905
package Rectangle;

import java.util.Scanner;

public class Rectangle {
private double height;
private double width;

public Rectangle (){
    
}
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }




public void input(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the height of Rectangle: ");
    setHeight(Double.parseDouble(sc.nextLine()));
    System.out.println("Enter the width of Rectangle: ");
    setWidth(Double.parseDouble(sc.nextLine()));
}
public double Perimeter(){
    return (height + width) *2;
}
public double Area (){
    return height * width;
}
public void display (){
    System.out.println("Height: "+getHeight());
    System.out.println("Width: "+getWidth());
    System.out.println("Area: "+ Area());
    System.out.println("Perimeter: "+Perimeter());
    
}
   

}