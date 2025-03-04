/*public class Main 
{
  static int x = 5;
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(x);
  }
}
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();
    Main myObj2 = new Main();
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}

public class Main {
  int x ;

  public static void main(String[] args) {
    Main myObj1 = new Main();
    myObj1.x=30;
    Main myObj2 = new Main();
    myObj2.x=50;
    if(myObj1.x > myObj2.x)
    {
    System.out.println(myObj1.x+ " is greater");
    }
    else
    {
    System.out.println(myObj2.x+ " is greater");
    }
  }
}*/

public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}



