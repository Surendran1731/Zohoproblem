//Simple Java program to print next
//greater elements in a given array
//https://www.geeksforgeeks.org/next-greater-element/
public class ZohoImportant1 {
 /* prints element and NGE pair for
  all elements of arr[] of size n */
 static void printNGE(int arr[], int n)
 {
     int next, i, j;
     for (i = 0; i < n; i++) {
         next = -1;
         for (j = i + 1; j < n; j++) {
             if (arr[i] < arr[j]) {
                 next = arr[j];
                 break;
             }
         }
         System.out.println(arr[i] + " -- " + next);
     }
 }

 public static void main(String args[])
 {
     int arr[] = { 4 , 5 , 2 , 25 };
     int n = arr.length;
     printNGE(arr, n);
 }
}

