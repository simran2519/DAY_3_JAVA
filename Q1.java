package DAY_3;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose occurence you want to count");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
