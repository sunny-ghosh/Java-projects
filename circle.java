// Q: W.A.P in java to calculate the area and perimeter of a circle. //
/* Here, this program is following the parameterized with return type method. */ 


class General
{
    float pi = 3.14f;
    float area(float r)
    {
        return(pi*r*r);
    }
    float perimeter(float d)
    {
        return(pi*d);
    }
}
class circle 
{
    public static void main(String args[])
    {
        General ob = new General();
        float a = ob.area(5.0f);
        float p = ob.perimeter(10.0f);
        System.out.println("The area of the circle is " + a);
        System.out.println("The perimeter of the circle is " + p);
    }   
}
