//4.Sort 0 1 2
//        Problem statement
//        You have been given an integer array/list(ARR) of size 'N'. It only contains 0s, 1s and 2s. Write a solution to sort this array/list.
//
//        Note :
//        without using any inbuilt function
//        Try to solve the problem in 'Single Scan'. ' Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
//        Sample Input 1 :
//        2
//        6
//        0 1 2 2 1 0
//        7
//        0 1 2 1 2 1 2
//        Sample Output 1 :
//        0 0 1 1 2 2
//        0 1 1 1 2 2 2
package DAY_3;

import java.util.Scanner;

public class Q4
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

        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            if(arr[i]==1)
            {
                one++;
            }
            if(arr[i]==2)
            {
                two++;
            }
        }
        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
        }
        for(int i=zero;i<zero+one;i++)
        {
            arr[i]=1;
        }
        for(int i=zero+one;i<arr.length;i++)
        {
            arr[i]=2;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
