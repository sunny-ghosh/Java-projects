// 1. W.A.P. in JAVA to calculate the Factorial of a number using recursion. //

import java.util.*;  

class factorial_no
{
    long factorial(long x)
    {
        long fact;
        if((x==0)||(x==1))
        {
            return(1);
        }
        else
        {
            fact=x*factorial(x-1);
            return(fact);
        }
    }
}
class Recfact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number==> ");     
        long num = sc.nextInt();
        factorial_no factob = new factorial_no();
        if(num>=0)
        {
            long f = factob.factorial(num); 
            System.out.print("The factorial of " + num + " is " + f + " .");
        }
        else
        {
            System.out.print("ERROR! The number should be positive to get factorial.");
        }
    
    }
}