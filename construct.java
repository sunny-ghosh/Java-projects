// 5. W.A.P. in JAVA to show the use of "this" keyword. //

class C
{
    int year;
    String stream;
    C(int year,String stream)
    {
        this.year = year;
        this.stream = stream;
        System.out.println("My stream is " + stream + ". " + "My batch is " + year + ".");
    }    
}
class construct
{
    public static void main(String args[])
    {
        C ob = new C(2023,"BCA");
    }
}
