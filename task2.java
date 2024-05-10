//Write a java program for area calculation (circle, square, rectangle, cone and triangle) using
  //      constructor.
class shape{
    double dim1,dim2;
    shape(double dim1, double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    double area(){
        return 0;
    }
}
class Circle extends shape{
    Circle(double r){
        super(r,0);
    }
    double area(){
        return Math.PI*dim1*dim1;
    }
}
class Square extends shape{
    Square(double side){
        super(side,0);
    }
    double area(){
        return dim1*dim1;
    }
}
class Triangle extends shape{
    Triangle(double b,double h){
        super(b,h);
    }
    double area(){
        return 0.5*dim1*dim2;
    }
}
class Cone extends shape{
    Cone(double r,double h){
        super(r,h);
    }
    double area(){
        return Math.PI*(dim1*dim1)*dim2;
    }
}

public class task2 {
    public static void main(String[]args){
        Circle circle=new Circle(3);
        Square sq=new Square(4);
        Triangle tr=new Triangle(3,4);
        Cone cone=new Cone(5,6);
        System.out.println("area of circle "+circle.area());
        System.out.println("area of square "+sq.area());
        System.out.println( "area of Triangl "+tr.area());
        System.out.println("area of Cone "+cone.area());
    }
}
