//package week05.day04.p1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int length=scanner.nextInt();
		System.out.println("Enter the array elements :");
		int arr[]=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter the search element :");
		int search=scanner.nextInt();
		for(int j=0;j<length;j++) {
			if(arr[j]==search) {
				System.out.println("Index of the search element is :"+j);
				count ++;
			}
		}
		if(count==0) {
			System.out.println("Element you searched is not available");
		}

	}

}
