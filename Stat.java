// 6. WAP in JAVA to show the use of "static" keyword. //
    
// 'static' keyword:used for Memory management
// 'static' variable : common property for all objects(e.g college name of students, organization name of employess)

class Student
{
    long id;                                        //instance variable non-static 
    String name;                                   //Data Member non-static 
    static String clg = "MAKAUT";                 //static variable
    static void Update()
    {
    	clg = "SVIMS";
    }
    void Record(long id,String name)             //Member Function & non-static 
    {
    	this.id=id;
    	this.name=name;
        System.out.println("Student's Id : "+ id +"\tStudent's Name : " + name +"\tCollege Name :"+ clg);
    }
}
class Stat
{ 
    public static void main(String args[])
    {
    	Student s = new Student();
    	s.Record(220043,"Sunny");
    	// Update();              //calling of static method without object of the class.
    }
}