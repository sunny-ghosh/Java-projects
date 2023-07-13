class G
{
    int n;
    void check(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+" is an even number.");
        }
        else
        {
            
            System.out.println(n+" is an odd number.");
        }
    }
}
class S extends G
{
    void calculate(int n)
    {
        super.check(n);
        int i,fact=1;
        for(i=n;i>=1;i--)
        {
            fact = fact * i;
        }
        System.out.print("The factorial of " + n + " is " + fact);
    }
}
class overriding 
{
    public static void main(String args[])
    {
        S ob = new S();
        ob.calculate(5);
    }    
}
