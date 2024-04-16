import java.util.ArrayList;

public class Main {
  // Function for linear search
    public static int search(int num[], int x)
    {
        int l = num.length;
 
        // Traverse the given array
        for (int i = 0; i < l; i++) {
 
            // If requested is element found 
            // then return that index
            if (num[i] == x)
                return i;
        }
        return -1;
    }
 
    // Testing piece
    public static void main(String args[])
    {
        // Given ArrayList
        int num[] = { 2, 4, 6, 8, 10 };
 
        // Searching for
        int x = 10;
 
        // Function Call
        int result = search(num, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present"
                             + " at index "
                             + result);
    }
}