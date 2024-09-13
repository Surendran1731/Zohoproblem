import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ValidPeranthesys {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            // Taking sentence and delimiter from the user
            System.out.println("Enter a sentence:");
            String sentence = sc.nextLine();
            
            System.out.println("Enter a delimiter:");
            String delimiter = sc.nextLine();
            
            // Splitting the sentence
            String[] result = split(sentence, delimiter);
            
            // Printing the result
            System.out.println(Arrays.toString(result));
        }
    }

    // Function to split the string based on a delimiter
    public static String[] split(String str, String delimiter) {
        // Checking if the delimiter is empty or null
        if (delimiter == null || delimiter.isEmpty()) {
            throw new IllegalArgumentException("Delimiter cannot be null or empty.");
        }

        // Edge case for empty input string
        if (str == null || str.isEmpty()) {
            return new String[0];
        }

        // List to store the parts of the sentence
        List<String> resultList = new ArrayList<>();
        
        int delimiterLength = delimiter.length();
        int start = 0;
        int end;

        // Finding each occurrence of the delimiter and splitting the sentence
        while ((end = indexOf(str, delimiter, start)) != -1) {
            resultList.add(str.substring(start, end));
            start = end + delimiterLength;
        }
        
        // Adding the last part after the final delimiter
        resultList.add(str.substring(start));

        // Converting the result list to an array and returning it
        return resultList.toArray(new String[0]);
    }

    // Helper method to find the index of the delimiter in the string
    private static int indexOf(String str, String delimiter, int fromIndex) {
        int strLength = str.length();
        int delimiterLength = delimiter.length();
        
        // Searching for the delimiter in the string starting from 'fromIndex'
        for (int i = fromIndex; i <= strLength - delimiterLength; i++) {
            int j;
            for (j = 0; j < delimiterLength; j++) {
                if (str.charAt(i + j) != delimiter.charAt(j)) {
                    break;
                }
            }
            if (j == delimiterLength) {
                return i;  // Returning the index of the delimiter
            }
        }
        return -1;  // Returning -1 if the delimiter is not found
    }
}
