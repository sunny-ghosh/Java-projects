// 3. W.A.P. in JAVA to check whether the number is a pallindrome or not. //

import java.util.*; 
class Pallindrome
{
    int digit,temp,sum=0;
    void pallindrome_no(int num)
    {
        temp=num;
        while(temp>0)
        {
         digit=temp%10;
         sum=(sum*10)+digit;
         temp=(temp/10);
        }
        if(sum==num)
        {
            System.out.print(num + " is a Pallindrome Number.");
        }
        else
        {
            System.out.print(num + " is not a Pallindrome Number.");
        }
    } 
}
class Pallindrome_no
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number==> ");     
        int n = sc.nextInt();
        Pallindrome pob = new Pallindrome();
        pob.pallindrome_no(n);
    }
} 
