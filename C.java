// Constructor overloading //

class A
{
    int a;
    double b;
    String c;
    A()
    {
        a=20;
        b=98.3;
        c="Sayantan";
        System.out.println(a+" "+b+" "+c);
    }
    A(int x)
    {
        a=x;
    }
    A(double y,String z)
    {
        b=y;
        c=z;
    }
}
class C
{
    public static void main(String args[])
    {
        A r1 = new A();
        A r2 = new A(20);
        A r3 = new A(98.3,"Sayantan");
        System.out.println(r1.a+" "+r1.b+" "+r1.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}