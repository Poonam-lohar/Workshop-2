package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

/* take array of characters and convert uppercase

 */
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of array elements: ");
        int n = sc.nextInt();
        System.out.println("Enter" + n + "String;");
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println("Enter string array: " + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            array[i] = array[i].toUpperCase();
        }
        System.out.println(Arrays.toString(array));
    }
}