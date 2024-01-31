//3.Find Duplicates In Array
//        Problem statement
//        You are given an array/list 'ARR' consisting of N integers, which contains elements only in the range 0 to N - 1. Some of the elements may be repeated in 'ARR'. Your task is to find all such duplicate elements.
//        Note:
//        1. All the elements are in the range 0 to N - 1.
//        2. The elements may not be in sorted order.
//        3. You can return the duplicate elements in any order.
package DAY_3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3
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
        Arrays.sort(arr);
        int count=1;
        int i;
        for( i=0;i<arr.length-1;i++)
        {
           if(arr[i]==arr[i+1])
           {
               count++;
           }
           if(arr[i]!=arr[i+1])
           {
               if(count>1)
               {
                   System.out.println(arr[i] + " is duplicate");
               }
               count=1;
           }
        }
        if(count>1)
        {
            System.out.println(arr[i] + " is a duplicate ");
        }
    }
}
