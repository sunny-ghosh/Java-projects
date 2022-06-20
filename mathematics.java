// Q: W.A.P. in java to find L.C.M. and H.C.F of two numbers. //
/* Here, this program is following the parameterized with return type method. */ 
// Code: //

import java.util.*;      
class Common
{
    int i,j;
    int l_c_m(int n1,int n2)
    {
        for(i=(n1>n2)?n1:n2;i<=(n1*n2);i++)
        {
            if((i%n1==0)&&(i%n2==0))
            {
                break;
            }
        }
        return(i);
    }   
    int hcf(int n1,int n2)
    {
        for(j=(n1<n2)?n1:n2;j>=1;j--)
        {
            if((n1%j==0)&&(n2%j==0))
            {
                break;
            }
        }
        return(j);
    }         
}
class mathematics
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the first number==> ");     
        int n1 = sc.nextInt();
        System.out.print("Enter the second number==> ");     
        int n2 = sc.nextInt();
        Common  factor = new Common();
        int lcm = factor.l_c_m(n1,n2);
        int gcd = factor.hcf(n1,n2);
        System.out.println("The required L.C.M of " + n1 + " and " + n2 + " is " + lcm + ".");
        System.out.println("The required H.C.F of " + n1 + " and " + n2 + " is " + gcd + ".");
    }
} 