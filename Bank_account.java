// Q: Suppose you have a Bank Account with an initial amount of 500 and you have to add some more amount to it. 
// W.A.P in JAVA to create a class "AddAmount with a data member named amount with an initial value of 500.
// Now, make two constructors of this class as follows:-
// 1> without any parameter- no amount will be added then just display your balance with out updating ;
// 2> having a parameter which is the amount that will be added to the account & display the final amount.




import java.util.*;
class AddAmount
{
    float amount = 500.00f;
    AddAmount()
    {
        System.out.print("Available Balance : " + amount);
    }
    AddAmount(int deposit)
    {
        System.out.print("Available Balance : " + (amount+deposit));        
    }
}
class Bank_account 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of money for deposit : ");
        int deposit = sc.nextInt();
        AddAmount ob = new AddAmount(deposit);    
    }  
}
