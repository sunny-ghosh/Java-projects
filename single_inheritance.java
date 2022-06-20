// 7. W.A.P. in JAVA to show the example of Single Level Inheritance. //

import java.util.*;   
class area
{
    int l,b;
    void calculate1()
    {
        System.out.println("The area of a rectangle is " + (l*b) + " .");
    }
}
class perimeter extends area
{
    void calculate2()
    {
        System.out.println("The perimeter of a rectangle is " + (2*(l+b)) + " .");
    }
}
class single_inheritance
{
    public static void main(String args[])
    {
        perimeter single = new perimeter();
        single.l = 22;
        single.b = 5;
        single.calculate1();
        single.calculate2();
    }
    
}
