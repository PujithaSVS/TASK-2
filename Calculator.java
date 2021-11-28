import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Enter the operator:");
      char opr = sc.next();
      swtich(opr)
      {
        case "+" : System.out.println(a+b); 
          break;
        case "-" : System.out.println(a-b); 
          break;
        case "*" : System.out.println(a*b); 
          break;
       case "/" : System.out.println(a/b); 
          break;
      default: System.out.print("Wrong operator input");
      }
  }
}
