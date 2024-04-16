public class Main {

  public static boolean Linear(int x[], int y, int z, int number) {
    // base case that ends function if the end of the program is reached
    // without finding the desired result
    if (z == y) {
      return false;
    }
    // checks the bool val of the current index and moves on if false
    // ends with true if the specified number is found
    else {
      if (x[z] == number) {
        return true;
      } else {
        return Linear(x, y, z + 1, number);
      }
    }
  }

  // sets up and prints the results for a given array
  public static void main(String args[]) {
    int arr[] = { 23, 345, 12, 96, 5 };
    int size = arr.length;
    int number = 2;
    boolean Bool = Linear(arr, size, 0, number);
    System.out.print(Bool);
  }
}