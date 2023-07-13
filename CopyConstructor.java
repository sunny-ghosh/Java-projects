class A
{
    int a; String name;
    A()
    {
        a = 22;
        name = "Sayantan";
        System.out.println(a+" "+name);
    }
A(A ref)
{
    a=ref.a;
    name=ref.name;
    System.out.println(a+" "+name);
}
}
class CopyConstructor
{
public static void main(String args[])
{
    A obj1=new A();
    A obj2=new A(obj1);
}
}