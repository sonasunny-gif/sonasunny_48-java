import java.util.Scanner;
class string
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st string :");
String str1=sc.nextLine();
System.out.println("Enter 2nd string :");
String str2=sc.nextLine();
String str="hello";
System.out.println("Length of 1st string is :" +str1.length());
System.out.println("The 3rd letter in 1st string is :" +str1.charAt(2));
System.out.println("Concatination of Strings :" +str1.concat(str2));
System.out.println("Replacing of character :" +str.replace('h','l'));
System.out.println("checking of string :"+str.startsWith("he"));
System.out.println("Compare 2 strings :" +str1.compareTo(str2));
System.out.println("Checking 2 strings are equal or not :" +str1.equals(str2));
System.out.println("convert 1st string to upper case :" +str1.toUpperCase());
System.out.println("Convert 2nd sring into lower case :" +str2.toLowerCase());
}
}

