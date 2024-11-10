import java.util.Scanner;
class Employee
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int empno;
String ename;
float esal;
System.out.println("enter emp number:");
empno =sc.nextInt();
System.out.println("enter emp name:");
ename =sc.next();
System.out.println("enter emp salary:");
esal =sc.nextFloat();
System.out.println("the given employee number is:"+empno);
System.out.println("the given employee name is:"+ename);
System.out.println("the given employee salary is:"+esal);
}
}