import java.util.*;
class Naturalno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,n,sum=0;
System.out.println("enter n natural numbers");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("The sum of natural numbers is:"+sum);
}
}