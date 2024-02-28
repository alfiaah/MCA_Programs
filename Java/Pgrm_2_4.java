//WAP to sort elements in an array in ascending order.

import java.io.*;

class Pgrm_2_4
 {
    public static void main(String args[])
    {
        try{
            DataInputStream d=new DataInputStream(System.in);
            System.out.println("Albin Joseph");
            System.out.println("Enter the size of array");
            int n=Integer.parseInt(d.readLine());
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the elements");
                arr[i]=Integer.parseInt(d.readLine());
            }
            System.out.println("Array sorted");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<(n-1)-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(" "+arr[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}