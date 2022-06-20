                 //*** Exammple of Multiple Inheritance ***//

class Number
{
    int n = 50;
    void display()
    {
        System.out.println("The number is " + n + " .");
    }
}
interface Square
{
   public void area1(int s);
}
interface Rectangle
{
    public void area2(int l, int b);
}
class even extends Number implements Square,Rectangle
{
    void check()
    {
        if(n%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
    public void area1(int s)
    {
        System.out.println("The area of a square is " + (s*s) + " .");

    }
    public void area2(int l, int b)
    {
        System.out.println("The area of a rectangle is " + (l*b) + " .");
    }
}
class Multiple_inheritance
{
    public static void main(String args[])
    {
        even ob = new even();
        ob.display();   
        ob.check();
        ob.area1(5);
        ob.area2(5,10);
    }
}
