//Java program to move all zeros to the end

import java.util.*;

public class ZohoImportant2 {
 public static void main(String[] args)
 {
     int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
     int n = A.length;
     int[] B = new int[n];
     int j = 0;
     int count = 0;
     for (int i = 0; i < n; i++) {
         if (A[i] != 0) {
             B[j] = A[i];
             j++;
         }
         else {
             count++;
         }
     }
     while (count > 0) {
         B[j] = 0;
         count--;
         j++;
     }
     for (int i = 0; i < n; i++) {
         A[i] = B[i];
     }

     for (int i = 0; i < n; i++) {
         System.out.print(A[i] + " "); // Print the array
     }
 }
}