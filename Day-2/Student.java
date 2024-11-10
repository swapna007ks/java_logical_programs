import java.util.Scanner;
 class Student
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int studno,maths,physics,computers,total;
        String studname;
        float studavg;
        System.out.println("Enter Student Number: ");
        studno = sc.nextInt();
        System.out.println("Enter Student Name: ");
        studname = sc.next();
        System.out.println("Enter marks for physics: ");
        maths = sc.nextInt();
        System.out.println("Enter marks for chemistry: ");
        physics = sc.nextInt();
        System.out.println("Enter marks for maths: ");
        computers = sc.nextInt();
        total = maths+physics+computers;
        studavg = total / 3;
           System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + studavg);
        Scanner.close();
    }
}