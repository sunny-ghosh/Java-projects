// 3. W.A.P. in JAVA to show the example of FUNCTION OVERLOADING. //

class General
{
    void area(int s)
    {
        System.out.println("The area of a square is " + (s*s) + (" ."));  
    }
    void area(int l,int b)
    {
        System.out.println("The area of a rectangle is " + (l*b) + (" ."));
    }    
}
class foverloading
{
    public static void main(String args[])
    {
        General calculate = new General();
        calculate.area(5);
        calculate.area(22,5);
    }
}
