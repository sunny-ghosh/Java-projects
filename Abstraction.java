// 1. W.A.P. in JAVA to show the example of "abstract" class. //

abstract class A 
{
    void m1()
    {
        System.out.println("Welcome in SVIMS!");
    }
    abstract void m2();
}
class B extends A
{
    void m2()
    {
        System.out.println("Hello JAVA...");
    }
}
class Abstraction
{
    public static void main(String args[])
    { 
        B ob = new B();
        ob.m1();
        ob.m2();
    }
}