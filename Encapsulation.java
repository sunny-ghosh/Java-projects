class A
{
    private int value;
    public void setvalue(int x)
    {
        value=x;
    }
    public int getvalue()
    {
        return value;
    }
}
class EncapsulationOvercome
{
    public static void main(String args[])
    {
     A r =new A();
    r.setvalue(12);
    System.out.println(r.getvalue());
    }
}