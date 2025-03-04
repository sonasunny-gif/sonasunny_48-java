import java.util.Scanner;
public class product 
{
    public static void main(String []args)
     {
        int pcode;
        String pname;
        int price;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1st product code, name, price:");
   
        pcode = scanner.nextInt();
        pname = scanner.nextLine();
        price = scanner.nextInt();
        
        System.out.println("Code = " +pcode);
        System.out.println("Name = " +pname);
        System.out.println("Price = " +price);
        
        Scanner scanner1 = new Scanner(System.in);
         System.out.println("Enter 2nd product code, name, price:");
   
        pcode = scanner1.nextInt();
        pname = scanner1.nextLine();
        price = scanner1.nextInt();
        
        System.out.println("Code = " +pcode);
        System.out.println("Name = " +pname);
        System.out.println("Price = " +price);
        
        Scanner scanner2 = new Scanner(System.in);
         System.out.println("Enter 3rd product code, name, price:");
   
        pcode = scanner2.nextInt();
        pname = scanner2.nextLine();
        price = scanner2.nextInt();
        
        System.out.println("Code = " +pcode);
        System.out.println("Name = " +pname);
        System.out.println("Price = " +price);
    }
}

