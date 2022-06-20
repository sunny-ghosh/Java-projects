// Q: W.A.P. in java to check whether a number is an Armstrong number or not. //
/* Here, this program is following the parameterized with no return type method. */ 
// Code: //

import java.util.*;      
class Armstrong_no
{
    int temp,digit,sum=0;
    void arms_no(int num)
    {
        temp=num;
        while(temp>0)
        {
            digit=(temp%10);
            sum=sum+(digit*digit*digit);
            temp=(temp/10);
        }
        if(sum==num)
        {
            System.out.print("This number is an Armstrong Number.");
        }
        else
        {
            System.out.print("This number is not an Armstrong Number.");
        }


    }    
}
class armstrong
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number==> ");     
        int n = sc.nextInt();
        Armstrong_no arms = new Armstrong_no();
        arms.arms_no(n);
    }
} 
