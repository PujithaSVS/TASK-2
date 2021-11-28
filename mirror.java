import java.util.*;
class mirror
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
    for(int i=0;i<n;i++)
    {
      if(a[a[i]]=i)
      {
        b = true;
        continue;
      }
      else
      {
        break;
        b = false;
      }
    }
    System.out.print(b);
  }
}
