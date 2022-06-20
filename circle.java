// Q: W.A.P in java to calculate the area and perimeter of a circle. //
/* Here, this program is following the parameterized with return type method. */ 
// Code: //

class General
{
    float pi = 3.14f;
    float area(float r)
    {
        return(pi*r*r);
    }
    float perimeter(float r)
    {
        return(2*pi*r);
    }
}
class circle 
{
    public static void main(String args[])
    {
        General round = new General();
        float a = round.area(5.0f);
        float p = round.perimeter(5.0f);
        System.out.println(a);
        System.out.println(p);
    }   
}
