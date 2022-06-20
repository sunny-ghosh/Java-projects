// 4. W.A.P in JAVA to show different types of "unchecked exceptions" by using multi catch blocks. // 

import java.util.*;
class Unchecked_exceptions
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String S = null;
        int marks[5];
        int i;
        System.out.println("Enter the marks of each subjects :-\n");
        for(i=0;i<5;i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the array index : ");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();
        try
        {
            System.out.println(S.length());
            int result = marks[index]/number;
            System.out.println("The result of division is : " + result + " .");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException occured!");
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException occured!");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }   
}