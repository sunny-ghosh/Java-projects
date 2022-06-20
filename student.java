// 1. W.A.P in JAVA to take the input of student data and print(Using member functions). //

public class student
{   
    void data(int Roll,String Name,String Class,String Clg)
    {
        System.out.println("Roll No.: "+ Roll +"\tStudent's Name : "+ Name + "\t Class : " + Class + "\tInstitution : " + Clg);
    }
    public static void main(String args[])
    {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.data(43,"Sunny Ghosh","BCA(3rd sem)","SVIMS");
        s2.data(63,"Jayi Maity","BCA(3rd sem)","SVIMS");
        s3.data(51,"Biprojit Paul","BCA(3rd sem)","SVIMS");
    }    
}
