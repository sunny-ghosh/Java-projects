class A
{
    void msg()
    {
        System.out.print("Hello World!");
    }
}
class Welcome
{
    public static void main(String args[])
    {
        A ob = new A();
        ob.msg();
    }
}