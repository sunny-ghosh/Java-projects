// 4. W.A.P. in JAVA to show the example of CONSTRUCTOR OVERLOADING. //

class Check
{
    Check(int x)
    {
        if(x%2==0)
        {
            
            System.out.println(x + " is a Even Number.");
        }
        else
        {
            
            System.out.println(x + " is a Odd Number.");
        } 
    }
    Check(float y)
    {
        int i;
        for(i=2;i<=y;i++)
        {
         if(y%i==0)
         break;
        }
        if(i==y)
        {
            System.out.println(y + " is a Prime Number.");
        }
        else
        {
            System.out.println(y + " is not a Prime Number.");
        }
    }    
}
class coverloading
{
    public static void main(String args[])
    {
        Check data1 = new Check(436);
        Check data2 = new Check(10.5f);
    }
}





























// class Student
// {
//     String name,stream;
//     int roll,java,c,datastruct;
//     Student(String name,String stream,int roll)
//     {
//         this.name = name;
//         this.stream = stream;
//         this.roll = roll;
//         System.out.println("Student's Name : "+ name + "\t Class : " + stream + "\tRoll No.: " + roll);  
//     }
//     Student(int java,int c,int datastruct)
//     {
//         this.java = java;
//         this.c = c;
//         this.datastruct = datastruct;
//         System.out.println("Marks obtained in JAVA is : "+ java +"\nMarks obtained in C Programming is : "+ c + "\nMarks obtained in Data Structure is : "+ datastruct);
//     }    
// }
// class coverloading
// {
//     public static void main(String args[])
//     {
//         Student data1 = new Student("Sujay","BCA(3rd sem)",436);
//         Student data2 = new Student(10,9,8);
//     }
// }
