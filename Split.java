import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Split {
	
	
	
	public static void main(String [] args) {
	while(true) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a senatnce");
	String str1=sc.nextLine();
	System.out.println("Enter a delimeter");
	String str2=sc.nextLine();
	
	String []result=split(str1, str2);
	
	System.out.println(Arrays.toString(result));
	}
	}

	public static String[] split(String str, String delimiter) {
	    if (delimiter == null || delimiter.isEmpty()) {
	        throw new IllegalArgumentException("Delimiter cannot be null or empty.");
	    }

	    // Edge case for empty input string
	    if (str == null || str.isEmpty()) {
	        return new String[0];
	    }

	    // List to hold the split strings
	    List<String> resultList = new ArrayList<>();
	    
	    int delimiterLength = delimiter.length();
	    int start = 0;
	    int end;

	    while ((end = indexOf(str, delimiter, start)) != -1) {
	        resultList.add(str.substring(start, end));
	        start = end + delimiterLength;
	    }
	    
	    // Add the last part of the string after the last delimiter
	    resultList.add(str.substring(start));

	    // Convert list to array
	    return resultList.toArray(new String[0]);
	}

	// Helper method to find the index of the delimiter in the string
	private static int indexOf(String str, String delimiter, int fromIndex) {
	    int strLength = str.length();
	    int delimiterLength = delimiter.length();
	    
	    for (int i = fromIndex; i <= strLength - delimiterLength; i++) {
	        int j;
	        for (j = 0; j < delimiterLength; j++) {
	            if (str.charAt(i + j) != delimiter.charAt(j)) {
	                break;
	            }
	        }
	        if (j == delimiterLength) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	

}

