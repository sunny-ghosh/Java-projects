// Q: W.A.P. in java to check whether the number is Krishnamurthy or not. //
// Code: //

import java.util.*;             
class Strong_no
{
    Strong_no(int n)
    {
        int r,temp,sum=0;
        temp=n;
        while(temp>0)
        {
         r=temp%10;
         sum=sum+getfactorial(r);
         temp=temp/10;
        }
        if(sum==n)
        {
            System.out.print(n + " is a Strong Number.");
        }
        else
        {
            System.out.print(n + " is not a Strong Number.");
        }
       }    
    int getfactorial(int num)
    {
        int fact=1,i;
        for(i=1;i<=num;i++)
        {
         fact=fact*i;
        }
        return fact;
    }
}
class Krishnamurthy
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number : ");     
        int n = sc.nextInt();   
        Strong_no ob = new Strong_no(n);
    }
}