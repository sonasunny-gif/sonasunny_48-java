import java.util.Scanner;
class student
{
String name;
int rollno;
String branch;

student(String name,int rollno,String branch)
{
this.name=name;
this.rollno=rollno;
this.branch=branch;
}
public void display()
{
      System.out.println("Student Details:" +this.name+ ", " + this.rollno + ", " + this.branch);
}
}
class main
{
public static void main(String[] args)
{
student std[]=new student[3];
for(int i=0;i<3;i++)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter your name :");
String n=scanner.nextLine();
System.out.println("Enter your roll no :");
int r=scanner.nextInt();
scanner.nextLine();
System.out.println("Enter your branch :");
String b=scanner.nextLine();
std[i]=new student(n,r,b);
}
for(int i=0;i<3;i++)
{
std[i].display();
}
}
}

       
