import java.util.*;

class Arrayintornot
{
 int[] arr;
 int n,i;
 public void input()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of elements in array");
    n=sc.nextInt();
    arr=new int[n];
    System.out.println("Enter elements");
    for (int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
 }      

 public void print()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the searching element: ");
    int pt = sc.nextInt();
    for(i=0;i<n;i++)
    {
    if(arr[i]==pt)
    {
        System.out.print(pt+" is in array");
        break;
    }
    }    
     if(i==n)
    {
        System.out.print(pt+" is't in  array");
    }
 }
 public static void main(String args[])
 {
     Arrayintornot arr=new Arrayintornot();
     arr.input();
     arr.print();
 }
} 