// 1. W.A.P. in JAVA to calculate the Factorial of a number using recursion. //

import java.util.Scanner; 
class Krishnamurthy
{
    int num,i,temp,sum=0;
    void strong_no(int num)
    {
        temp=num;
        while(temp>0)
        {
         i=temp%10;
         sum=sum+getfactorial(i);
         temp=temp/10;
        }
        if(sum==num)
        {
            System.out.print(num + " is a Strong Number.");
        }
        else
        {
            System.out.print(num + " is not a Strong Number.");
        }

    }  
    int getfactorial(int x)
    {
        int fact=1,i;
        for(i=x;i>=1;i--)
        {
            fact=fact*i;
        }
        return(fact);
    }  
}
class StrongNo
{
    public static void main(String args[]) 
    {
        System.out.print("Enter the number==> ");  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Krishnamurthy strong = new Krishnamurthy();
        strong.strong_no(n);
    }
} 