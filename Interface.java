// 2. W.A.P in JAVA to show the example of "interface". //

interface I
{
    public void area(int s);
    public void perimeter(int l,int b);
}
class sub implements I
{
    void length(int r)
    {
        System.out.println("The diameter of a circle is " + (2*r) + " .");
    }
    public void area(int s)
    {
        System.out.println("The area of a square is " + (s*s) + " .");
    }
    public void perimeter(int l,int b)
    {
        System.out.println("The perimeter of a rectangle is " + (2*(l+b)) + " .");
    }
}
class Interface
{
    public static void main(String args[])
    {
        sub ob = new sub();
        ob.length(5);
        ob.area(5);
        ob.perimeter(5,10);
    }    
}
