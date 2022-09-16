// 1. W.A.P. in JAVA to show the example of "abstract" class. //

abstract class rectangle
{
    void area1(int l,int b)
    {
        int a1=l*b;
        System.out.println("Area of rectangle is : "+a1);
    }
    abstract void area2(int s);
}
class square extends rectangle
{
    void area2(int s)
    {
        int a2=s*s;
        System.out.println("Area of square is : "+a2);
    }
}
class Abstraction
{
    public static void main(String args[])
    {
        square obj=new square();
        obj.area1(2,3);
        obj.area2(4);
    }
}