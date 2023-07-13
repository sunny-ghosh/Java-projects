package p;
public class Fact 
{
    int i,fact=1;
    public void calculate(int n)
    {
        for(i=n;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.print("The factorial of "+n+" is "+fact);
    }
    
}
