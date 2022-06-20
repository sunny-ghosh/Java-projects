// This is the basic structure of a program in java. //
// Q: W.A.P in java to print your name. //
// Code: //
class C1                             // This is a general class of this program.
{
  String a;                         // This is the data members declaration line.
  void print()                      // This is a method of the general class.
 {
   a = ("My name is Sunny Ghosh.");
  System.out.println(a);        // This is used to print the value of the data members.
 }
}
class name                     // This is the main class of this program.
{
   public static void main(String args[])      // This is the main method declaration line.
 {
    C1 my_name = new C1();          // This is the creation line of the object of the general class.
    my_name.print();                // Here, the mehod is calling by the object.
 }
}
