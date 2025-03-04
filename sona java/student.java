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
      System.out.println("Student Details:");
      System.out.println(this.name+ ", " + this.rollno + ", " + this.branch);
}
}
class main
{
public static void main(String[] args)
{
student std1=new student("sona",48,"mca");
student std2=new student("stebin",68,"Mtech");
std1.display();
std2.display();
}
}


