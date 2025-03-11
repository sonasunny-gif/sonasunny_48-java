import java.util.Scanner;
class Employe{
   int e_no;
   String e_name;
   int e_salary;

Employe(int e_no, String e_name,int e_salary){
      this.e_no= e_no;
      this.e_name = e_name;
      this.e_salary = e_salary;
   }
public void printDetails() {
      System.out.print("Employee Details: ");
      System.out.println("No :"+e_no+ ",Name :" + e_name + ",Salary :" + e_salary);
   }
   }
   
class emp{
   public static void main(String[] args) {
     Employe emp[]=new Employe[3];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
      {
      System.out.println("Enter the details of Employee-"+ (i+1));
      System.out.print("No.:");
      int k=sc.nextInt();sc.nextLine();
      System.out.print("Name:");
      String n=sc.nextLine();
      System.out.print("Salary:");
      int s=sc.nextInt();sc.nextLine();
      emp[i]=new Employe(k,n,s);
      }
      System.out.println("Enter the Employee no to search:");
      int e=sc.nextInt();
          
    for(int i=0;i<3;i++)
    {
    if(emp[i].e_no==e)
    {
    emp[i].printDetails();
    }
    }
     
}
}

