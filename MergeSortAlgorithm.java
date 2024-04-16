import java.util.Arrays;
public class Main {
  
  public static void mergeSort(int[] a, int n) {
    //verrifies that the array is more than one value
    if (n < 2) {
      return;
    }

    //sets the middle, left, and right variables for storing.
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
    
    //sets all values for the left and right sides of the array
    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }

    //sets constructors for merge and mergeSort
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
  }

  public static void merge(int[] a, int[] l, int[] r, int left, int right) {

    //sets varriables for itterating through the indexes of l, r, and a
    int i = 0, j = 0, k = 0;

    //sets larger values to higher indexes and lover values to lower indexes
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      }
      else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }
 
  //provides the array to sort, calls the mergeSort method, and prints
  //the sorted array
  public static void main(String args[]) { 
   int  arr[] = {35,953,1,95,52};
   int size = arr.length;
   mergeSort(arr,size);
   System.out.print(Arrays.toString(arr));
  }
}

