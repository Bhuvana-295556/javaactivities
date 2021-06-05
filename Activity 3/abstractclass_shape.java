import java.util.Scanner;
 
abstract class calcArea {
    
    abstract void findSquare(double s);
    abstract void findCircle(double r);
}
 
class findArea extends calcArea {
 
    void findSquare(double s)
    {
        double area = s*s;
        System.out.println("Area of Square: "+area);
    }
     
    void findCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class area {
    public static void main(String args[])
    {
        double  r, s;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter Side of a Square: ");
        s = get.nextDouble();
        area.findSquare(s);
 
        System.out.print("\nEnter Radius of Circle: ");
        r = get.nextDouble();
        area.findCircle(r);
    }
}   
