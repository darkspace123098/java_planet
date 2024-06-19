abstract class Shape
{
    double h,w;
    abstract void area(double h, double w);
}

abstract class Rectangle extends Shape
{
    void area(double a,double b)
    {
        System.out.println("Area of rectangle :"+a*b);
    }
}

abstract class Triangle extends Shape
{
    void area(double a,double b)
    {
        System.out.println("Area of Triangle :"+0.5*a*b);
    }
}

abstract class Ellipse extends Shape
{
    void area(double a,double b)
    {
        System.out.println("Area of Ellipse :"+(3.14*a*b));
    }
}

class AbstractDemo
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(){};
        r.area(2,5);
        Triangle t = new Triangle(){};
        t.area(2,5);
        Ellipse e = new Ellipse(){};
        e.area(2,5);
        
    }
}