package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int [] arr = new int [] {5, 4 , 8, 9 , 1};

        int b;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i -1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    b = arr[j + 1];

                    arr[j+1] = arr[j];

                    arr[j] = b;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
