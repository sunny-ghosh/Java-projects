// Q: W.A.P in java to create a calculator. //
// Code: //
class G1
{
 int n1,n2,sum,sub,mul,rem;
 float div;
 void add()
 {
   sum=(n1+n2);
  System.out.println(sum);
 }
 void subtract()
 {
   sub=(n1-n2);
  System.out.println(sub);
 }
 void multiply()
 {
   mul=(n1*n2);
  System.out.println(mul);
 }
 void divide()
 {
   div=(n1/n2);
  System.out.println(div);
 }
 void remainder()
 {
   rem=(n1%n2);
  System.out.println(rem);
 }
}
class calculator
{
   public static void main(String args[])
 {
    G1 calculation = new G1();
    calculation.n1 = 30;
    calculation.n2 = 20;
    calculation.add();
    calculation.subtract();
    calculation.multiply();
    calculation.divide();
    calculation.remainder();
 }
}