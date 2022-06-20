// 8. W.A.P. in JAVA to show the example of Multi-Level Inheritance. //

import java.util.*;
class s_area
{
    float pie = 3.14f;
    int r;
    void calculate1(int r)
    {
        this.r = r;
        System.out.println("The base area of a cone is " + (pie*r*r) + " .");
    }
}
class volume extends s_area
{
    int h;
    void calculate2(int h)
    {
        this.h = h;
        float vol = (pie*(r*r)*h)/3.0f;
        System.out.println("The volume of a cone is " + vol + " .");
   
    }
}
class l_area extends volume
{
    void calculate3()
    {
        float l = ((h*h)+(r*r))/((h*h)+(r*r));
        System.out.println("The lateral area of a cone is " + (pie*r*l) + " .");
    }
}
class multi_inheritance 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        l_area cone = new l_area();    
        System.out.println("Enter the radius of the base of a cone : ");
        int r = sc.nextInt();  
        System.out.println("Enter the height of a cone : ");
        int h = sc.nextInt();  
        cone.calculate1(r);
        cone.calculate2(h);                
        cone.calculate3();
    }
}
