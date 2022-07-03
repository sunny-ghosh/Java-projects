// Q: W.A.P. in java to print the fibonacci series in a given range. //
/* Here, this program is following the parameterized with no return type method. */ 
// Code: //

import java.util.*;             // * signifies all class, sub-packages and interfaces of util.package to be included in the program.

class fibonacci_no
{
    int i,old=0,ne=1,next;
    void phi(int n)
    {
        System.out.print("The fibonacci series in the given range :- \n" + old + "  " + ne + "  ");
        for(i=1;i<=n-2;i++) 
        {
            next=(old+ne);
            System.out.print(next + "  ");
            old=ne;
            ne=next;        
        }
    }    
}
class fibonacci
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number as the range of the series ==> ");     
        int count = sc.nextInt();                       // 'nextInt' is a method of Scanner class which accepts only integer input from the user.
        fibonacci_no fn = new fibonacci_no();
        fn.phi(count);
    }
} 