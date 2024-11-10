import java.util.Scanner;
public class StudentReport
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno,sub1,sub2,sub3,total;
String sname;
float savg;
System.out.println("enter student number: ");
sno = sc.nextInt();
System.out.println("enter student name: ");
sname = sc.next();
System.out.println("enter marks for physics: ");
sub1=sc.nextInt();
System.out.println("enter marks for computers: ");
sub2=sc.nextInt();
System.out.println("enter marks for maths: ");
sub3=sc.nextInt();
total=sub1+sub2+sub3;
savg=total/3;
System.out.println("\nStudent Report:");
System.out.println("Student Number: " + sno);
System.out.println("Student Name: " + sname);
System.out.println("Student Marks: " + total);
System.out.println("Average Marks: " + savg);
sc.close();
}
}

