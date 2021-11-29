import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean b = true;
    int[] a = new int[n];
    for(int j=0;j<n;j++)
    {
      a[j] = sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
      if(a[a[i]]==i)
      {
        b = true;
        continue;
      }
      else
      {
        b = false;
      }
    }
    System.out.print(b);
  }
}
