// Q: W.A.P in java to calculate the area and perimeter of a rectangle. //
/* Here, this program is following the parameterized with return type method. */ 
// Code: //

class gnrl
{
    float area(float l, float b)
    {
        return(l*b);
    }
    float perimeter(float l, float b)
    {
        return(2*(l+b));
    }
}
class rectangle
{
    public static void main(String args[])
    {    
        gnrl rect = new gnrl();
        float a = rect.area(5.0f,10.0f);
        float p = rect.perimeter(5.0f,10.0f);
        System.out.println(a);
        System.out.println(p);
    }   
}
