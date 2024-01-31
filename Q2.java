//2.Find First and Last Position of Element in Sorted Array
//        Problem statement
//        You are given a non-decreasing array 'arr' consisting of 'n' integers and an integer 'x'. You need to find the first and last position of 'x' in the array.
//        Note:
//        1. The array follows 0-based indexing, so you need to return 0-based indices.
//        2. If 'x' is not present in the array, return {-1 -1}.
//        3. If 'x' is only present once in the array, the first and last position of its occurrence will be the same.
//        Example:
//        Input:  arr = [1, 2, 4, 4, 5],  x = 4
//        Output: 2 3
//        Explanation: The given array’s 0-based indexing is as follows:
//        1      2     4     4     5
//        ↓      ↓     ↓     ↓     ↓
//        0      1     2     3     4
//        So, the first occurrence of 4 is at index 2, and the last occurrence of 4 is at index 3.

package DAY_3;

import java.util.Scanner;

public class Q2
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
        System.out.println("Enter the element whose occurence you want to find");
        int x=sc.nextInt();
        int firstOcc=-1;
        int secOcc=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                firstOcc=i;
                break;
            }
        }
        if(firstOcc==arr.length-1 || arr[firstOcc+1]!=arr[firstOcc])  //(if only one occurence or one occurence is at last)
        {
            secOcc=firstOcc;
        }
        for(int i=firstOcc;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])                            //if 4 4 4 5
            {
                secOcc=i;
                break;
            }
            else if(i==arr.length-2 && arr[firstOcc]==arr[arr.length-1])  //if 4 4 4
            {
                secOcc=arr.length-1;
            }
        }
//
        System.out.println("First Occurence is at "+ firstOcc);
        System.out.println("Second Occurence is at " + secOcc);
    }
}
