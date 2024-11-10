import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int prodno;
String prodname;
float prodcost;
float prodquantity;
float bill;
System.out.println("enter prod number:");
prodno=sc.nextInt();
System.out.println("enter prod name:");
prodname=sc.next();
System.out.println("enter prod cost:");
prodcost=sc.nextFloat();
System.out.println("enter prod quantity:");
prodquantity=sc.nextFloat();
System.out.println("enter prod bill:");
bill=sc.nextFloat();
bill=prodcost*prodquantity;
System.out.println("the prod no taken by the customer:"+prodno);
System.out.println("the prod name taken by the customer:"+prodname);
System.out.println("the prod cost taken by the customer:"+prodcost);
System.out.println("the given prod quantity:"+prodquantity);
System.out.println("the given prod bill:"+bill);
}
}




