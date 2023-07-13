// 7. W.A.P. in JAVA to show the example of Single Level Inheritance. //

class Spy
{
    int n;
    void shownumber(int n)
    {
        this.n = n;
        System.out.println("The given number is " + n);
    }
}
class Calculate extends Spy
{
    void check()
    {
        int r,s=0,p=1,temp=n;
        while(temp>0)
        {
            r=temp%10;
            s=s+r;
            p=p*r;
            temp=temp/10;
        if(s==p)
            System.out.println(n+" is a spy number.");
        else
            System.out.println(n+" is not a spy number.");
    }
}
class Single_Inheritance
{
    public static void main(String args[])
    {
        Calculate ob = new Calculate();
        ob.shownumber(1124);
        ob.check();
    }
}
