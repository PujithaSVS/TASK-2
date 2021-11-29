import java.util.*;
class ArrayList
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements:");
    int n = sc.nextInt();
    List<Integer> li = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      li.add(sc.nextInt());
    }
    System.out.print("Enter the element to be removed");
    int del = sc.nextInt();
    li.remove(new Integer(del));
    System.out.print(li);
  }
}
