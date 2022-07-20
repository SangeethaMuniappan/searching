//package week05.day04.p2;
import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
 int binarySearch(int arr[], int search)
 {
     int first = 0, last = arr.length - 1;
     while (first <= last) {
         int mid = first + (last - first) / 2;
         if (arr[mid] == search)
             return mid;
         if (arr[mid] < search)
             first = mid + 1;
         else
             last = mid - 1;
     }
     return -1;
 }
 public static void main(String args[])
 {
     BinarySearch ob = new BinarySearch();
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the length of the array :");
     int length=sc.nextInt();
     System.out.println("Enter the array elements :");
		int arr[]=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
	System.out.println("Enter the search element :");
	int search=sc.nextInt();

    Arrays.sort(arr);
     int result = ob.binarySearch(arr, search);
     if (result == -1)
         System.out.println("Element not present");
     else
         System.out.println("Element found at "
                            + "index " + result);
 }
}