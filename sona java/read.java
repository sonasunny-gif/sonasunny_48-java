import java.util.Scanner;
public class read
{
public static void main(String []args)
{
String name;
int age;
Long cls;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the name ,age,cls :");

name=scanner.nextLine();
age=scanner.nextInt();
cls=scanner.nextLong();

System.out.println("The name is :" +name);
System.out.println("The age is :" +age);
System.out.println("The class is :" +cls);
}
}

