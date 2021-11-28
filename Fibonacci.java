import java.util.*;
class Fibonacci {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
          int sum = 0;
          int a=0,b=1;
          System.out.println("Enter the nth number: ");
          int n = sc.nextInt();
          System.out.println("Fibonacci series: ");
          while(sum <= n)
          {
              System.out.print(sum + " ");
              a=b;
              b=sum;
              sum=a+b;
          }
     }
  
}
